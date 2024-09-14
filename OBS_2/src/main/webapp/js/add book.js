document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");
    
    form.addEventListener("submit", function (event) {
        event.preventDefault(); // Prevent the default form submission

        // Basic validation
        const title = document.getElementById("title").value.trim();
        const author = document.getElementById("author").value.trim();
        const isbn = document.getElementById("isbn").value.trim();
        const category = document.getElementById("category").value;
        const cutPrice = document.getElementById("cut-price").value.trim();
        const unitPrice = document.getElementById("unit-price").value.trim();
        const quantity = document.getElementById("quantity").value.trim();
        const binding = document.getElementById("binding").value;

        if (!category) {
            alert("Please select a category.");
            return;
        }

        if (!title) {
            alert("Please enter the book title.");
            return;
        }

        if (!author) {
            alert("Please enter the author's name.");
            return;
        }

        if (!isbn) {
            alert("Please enter the ISBN number.");
            return;
        }

        if (!cutPrice || isNaN(cutPrice) || parseFloat(cutPrice) < 0) {
            alert("Please enter a valid cut price.");
            return;
        }

        if (!unitPrice || isNaN(unitPrice) || parseFloat(unitPrice) < 0) {
            alert("Please enter a valid unit price.");
            return;
        }

        if (!quantity || isNaN(quantity) || parseInt(quantity) < 0) {
            alert("Please enter a valid quantity.");
            return;
        }

        if (!binding) {
            alert("Please select a binding type.");
            return;
        }

        // If all validations pass
        alert("Book information successfully submitted!");

        // You can also add AJAX or Fetch API here to submit the form data to the server
        // For example:
        /*
        fetch('/submit', {
            method: 'POST',
            body: new FormData(form)
        }).then(response => response.json())
          .then(data => {
              console.log('Success:', data);
          }).catch(error => {
              console.error('Error:', error);
          });
        */

        form.reset(); // Reset the form after submission
    });
});
