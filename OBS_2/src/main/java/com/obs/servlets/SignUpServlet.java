package com.obs.servlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        Connection con = null;
        PreparedStatement pstmt = null;
        boolean flag = false; // Track if the transaction was successful

        // Retrieve parameters from the request
        String category = request.getParameter("category");
        String firstName = request.getParameter("first-name");
        String lastName = request.getParameter("last-name");
        String address = request.getParameter("address");
        String companyNameInput = request.getParameter("company-name-input");
        String companyLocationInput = request.getParameter("company-location-input");
        String gstNo = request.getParameter("gst-no");
        String email = request.getParameter("email-id");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirm-password");
        String mobile = request.getParameter("mobile");
        String zipcode = request.getParameter("zipcode");
       
        
        // Validate that passwords match
        if (!password.equals(confirmPassword)) {
            out.println("Passwords do not match.");
            return;
        }
        
        try {
            // Load Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Establish connection to the database
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "root");

            // Disable auto-commit to manage transactions manually
            con.setAutoCommit(false);

            // Prepare the SQL insert query
            pstmt = con.prepareStatement("insert into signup (category, firstname, lastname, address, companyname, companylocation, gst_no, email, password, mobile,zipcode) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            // Set the values for the prepared statement from the form data
            pstmt.setString(1, category);
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);
            pstmt.setString(4, address);
            pstmt.setString(5, companyNameInput);
            pstmt.setString(6, companyLocationInput);
            pstmt.setString(7, gstNo);
            pstmt.setString(8, email);
            pstmt.setString(9, password);
            pstmt.setString(10, mobile);
            pstmt.setString(11, zipcode);

            // Execute the query and return the number of affected rows
            int n = pstmt.executeUpdate();

            if (n > 0) {
                // Success
                System.out.println("Record inserted successfully");
                flag = true;
            } else {
                // Failure
                System.out.println("Failed to insert record");
            }

        } catch (ClassNotFoundException | SQLException e) {
            out.println("Error: " + e.getMessage());
            e.printStackTrace();  // Print the stack trace in the logs
        }finally {
            try {
                // Commit or Roll back the transaction based on success or failure
                if (con != null) {
                    if (flag) {
                        con.commit(); // Commit if successful
                    } else {
                        con.rollback(); // Roll back if there was an error
                    }
                }
                // Close the statement and connection
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Send a success message to the client
        out.println("Sign-up successful! The following information is stored:<br/>");
        out.println("Category: " + category + "<br/>");
        out.println("First Name: " + firstName + "<br/>");
        out.println("Last Name: " + lastName + "<br/>");
        out.println("Address: " + address + "<br/>");
        out.println("Company Name: " + companyNameInput + "<br/>");
        out.println("Company Location: " + companyLocationInput + "<br/>");
        out.println("GST No: " + gstNo + "<br/>");
        out.println("Email: " + email + "<br/>");
        out.println("Password: " + password + "<br/>");
        out.println("mobile: " + mobile + "<br/>");
        out.println("zipcode: " + zipcode + "<br/>");
        out.println("<a href=\"/OBS_2/signup.html\">Sign up again</a>");
    }
}
