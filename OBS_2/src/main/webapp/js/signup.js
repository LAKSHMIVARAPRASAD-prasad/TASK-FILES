document.addEventListener('DOMContentLoaded', function() {
    var categorySelect = document.getElementById('category');
    var companyFields = ['company-name', 'company-location', 'gst-no'];

    function toggleCompanyFields() {
        var selectedValue = categorySelect.value;
        var shouldShow = selectedValue === 'Vendor';

        companyFields.forEach(function(id) {
            document.getElementById(id).style.display = shouldShow ? 'block' : 'none';
        });
    }

    // Initialize fields based on the default selection
    toggleCompanyFields();

    // Update fields when selection changes
    categorySelect.addEventListener('change', toggleCompanyFields);
});
