document.addEventListener('DOMContentLoaded', () => {
    const updateButtons = document.querySelectorAll('.update-btn');
    const deleteButtons = document.querySelectorAll('.delete-btn');
    const form = document.querySelector('form');

    // Handle Update button click
    updateButtons.forEach(button => {
        button.addEventListener('click', (event) => {
            const row = event.target.closest('tr');
            const userId = row.cells[0].innerText;
            const firstName = row.cells[2].innerText;
            const lastName = row.cells[3].innerText;
            const email = row.cells[4].innerText;
            const password = row.cells[5].innerText;
            const mobileNo = row.cells[6].innerText;
            const address = row.cells[7].innerText;
            const zipCode = row.cells[8].innerText;

            // Fill the form with the selected row data
            form.querySelector('#user-id').value = userId;
            form.querySelector('#first-name').value = firstName;
            form.querySelector('#last-name').value = lastName;
            form.querySelector('#email-id').value = email;
            form.querySelector('#password').value = password;
            form.querySelector('#mobile-no').value = mobileNo;
            form.querySelector('#address').value = address;
            form.querySelector('#zip-code').value = zipCode;
        });
    });

    // Handle Delete button click
    deleteButtons.forEach(button => {
        button.addEventListener('click', (event) => {
            const row = event.target.closest('tr');
            const userId = row.cells[0].innerText;

            if (confirm(`Are you sure you want to delete user with ID ${userId}?`)) {
                row.remove();
                alert(`User with ID ${userId} has been deleted.`);
            }
        });
    });

    // Handle form submission (Update)
    form.addEventListener('submit', (event) => {
        event.preventDefault();

        const userId = form.querySelector('#user-id').value;
        const firstName = form.querySelector('#first-name').value;
        const lastName = form.querySelector('#last-name').value;
        const email = form.querySelector('#email-id').value;
        const password = form.querySelector('#password').value;
        const mobileNo = form.querySelector('#mobile-no').value;
        const address = form.querySelector('#address').value;
        const zipCode = form.querySelector('#zip-code').value;

        // Find the row in the table with the matching user ID
        const rows = document.querySelectorAll('tbody tr');
        rows.forEach(row => {
            if (row.cells[0].innerText === userId) {
                row.cells[2].innerText = firstName;
                row.cells[3].innerText = lastName;
                row.cells[4].innerText = email;
                row.cells[5].innerText = password;
                row.cells[6].innerText = mobileNo;
                row.cells[7].innerText = address;
                row.cells[8].innerText = zipCode;

                alert(`User with ID ${userId} has been updated.`);
            }
        });
    });
});
