<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Application Status</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <!-- Header Section -->
        <header>
            <h1>Application Status</h1>
        </header>
        
        <!-- Student Information Section -->
        <section class="student-details">
            <div class="detail">
                <span>Name:</span><span id="name"></span>
            </div>
            <div class="detail">
                <span>Contact Number:</span><span id="contact-number"></span>
            </div>
            <div class="detail">
                <span>Email:</span><span id="email"></span>
            </div>
            <div class="detail">
                <span>Date of Birth (DAY):</span><span id="dob-day"></span>
            </div>
            <div class="detail">
                <span>Date of Birth (Month):</span><span id="dob-month"></span>
            </div>
            <div class="detail">
                <span>Date of Birth (Year):</span><span id="dob-year"></span>
            </div>
            <div class="detail">
                <span>Gender:</span><span id="gender"></span>
            </div>
            <div class="detail">
                <span>Photo:</span><span id="photo"></span>
            </div>
            <div class="detail">
                <span>10th Report Card:</span><span id="10th-report"></span>
            </div>
            <div class="detail">
                <span>12th Report Card:</span><span id="12th-report"></span>
            </div>
            <div class="detail">
                <span>Admission Order:</span><span id="admission-order"></span>
            </div>
            <div class="detail">
                <span>Transfer Certificate:</span><span id="transfer-cert"></span>
            </div>
            <div class="detail">
                <span>Selected College:</span><span id="selected-college"></span>
            </div>
            <div class="detail">
                <span>Selected Programs:</span><span id="selected-programs"></span>
            </div>
        </section>

        <!-- Confirmation Message and Button Section -->
        <section class="confirmation">
            <p>Your application has been successfully submitted.</p>
            <button id="close-button" class="btn">Close</button>
        </section>
    </div>

    <script src="script.js"></script>
</body>
</html>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    font-family: 'Arial', sans-serif;
    background-color: #f0f8ff; /* Light blue background */
    color: #222;
}

.container {
    width: 80%;
    margin: 0 auto;
    padding: 20px;
}

header {
    text-align: center;
    margin-bottom: 40px;
}

h1 {
    font-size: 36px;
    font-weight: bold;
    color: #222;
}

.student-details {
    margin-bottom: 40px;
    background-color: #f0f8ff;
    padding: 20px;
    border-radius: 10px;
}

.detail {
    display: flex;
    margin-bottom: 15px;
    font-size: 18px;
}

.detail span:first-child {
    font-weight: bold;
    width: 200px;
}

.confirmation {
    text-align: center;
}

.confirmation p {
    font-size: 20px;
    font-weight: bold;
    color: #228b22; /* Green color for confirmation */
}

.btn {
    font-size: 18px;
    font-weight: bold;
    background-color: #4682b4; /* Steel blue */
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s ease;
}

.btn:hover {
    background-color: #5f9ea0; /* Darker steel blue on hover */
}

.btn:active {
    background-color: #4169e1; /* Royal blue on click */
}
// Dummy data (simulating the studentData object)
const studentData = {
    Name: "John Doe",
    ContactNumber: "1234567890",
    EmailAddress: "johndoe@example.com",
    Day: "15",
    Month: "August",
    Year: "2000",
    Gender: "Male",
    Picture: "path/to/photo.jpg", // Replace with actual path or URL
    "10thReportCard": "path/to/10th_report_card.pdf", // Replace with actual path or URL
    "12thReportCard": "path/to/12th_report_card.pdf", // Replace with actual path or URL
    AdmissionOrder: "path/to/admission_order.pdf", // Replace with actual path or URL
    TransferCertificate: "path/to/transfer_certificate.pdf", // Replace with actual path or URL
    SelectedCollege: "XYZ University",
    SelectedPrograms: "Computer Science, Mechanical Engineering"
};

// Function to populate the application status page with student data
function populateStatusPage() {
    document.getElementById('name').textContent = studentData.Name;
    document.getElementById('contact-number').textContent = studentData.ContactNumber;
    document.getElementById('email').textContent = studentData.EmailAddress;
    document.getElementById('dob-day').textContent = studentData.Day;
    document.getElementById('dob-month').textContent = studentData.Month;
    document.getElementById('dob-year').textContent = studentData.Year;
    document.getElementById('gender').textContent = studentData.Gender;
    document.getElementById('photo').textContent = studentData.Picture;
    document.getElementById('10th-report').textContent = studentData["10thReportCard"];
    document.getElementById('12th-report').textContent = studentData["12thReportCard"];
    document.getElementById('admission-order').textContent = studentData.AdmissionOrder;
    document.getElementById('transfer-cert').textContent = studentData.TransferCertificate;
    document.getElementById('selected-college').textContent = studentData.SelectedCollege;

    // Split and display selected programs
    document.getElementById('selected-programs').textContent = studentData.SelectedPrograms;
}

// Function to handle closing the application when the Close button is clicked
function closeApplication() {
    window.close(); // Close the window
}

// Populate page on load
window.onload = function() {
    populateStatusPage();
    document.getElementById('close-button').addEventListener('click', closeApplication);
};
