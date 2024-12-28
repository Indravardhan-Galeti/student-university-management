<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Personal Details Page</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Personal Details</h1>
        
        <form id="personalDetailsForm">
            <!-- Name Field -->
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <!-- Contact Number Field -->
            <label for="contact">Contact Number:</label>
            <input type="text" id="contact" name="contact" maxlength="10" pattern="\d*" required>

            <!-- Email Field -->
            <label for="email">Email Address:</label>
            <input type="email" id="email" name="email" required>

            <!-- Gender Selection -->
            <label>Gender:</label>
            <div class="radio-group">
                <input type="radio" id="male" name="gender" value="Male" required>
                <label for="male">Male</label>
                <input type="radio" id="female" name="gender" value="Female" required>
                <label for="female">Female</label>
            </div>

            <!-- Date of Birth Dropdowns -->
            <label>Date of Birth:</label>
            <div class="dob-group">
                <select id="day" name="day"></select>
                <select id="month" name="month"></select>
                <select id="year" name="year"></select>
            </div>

            <!-- Photo Upload -->
            <label for="photo">Upload Photo:</label>
            <input type="file" id="photo" accept="image/*">
            <div class="photo-preview" id="photoPreview"></div>

            <!-- Next Button -->
            <button type="button" id="nextButton">Next</button>
        </form>
    </div>
    <script src="script.js"></script>
</body>
</html>
/* General Styles */
body {
    font-family: Arial, sans-serif;
    background-color: #f9f2ee;
    margin: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

/* Container */
.container {
    background: white;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    max-width: 500px;
    width: 100%;
}

/* Header */
h1 {
    text-align: center;
    margin-bottom: 20px;
}

/* Form Styling */
form {
    display: flex;
    flex-direction: column;
}

label {
    margin-top: 10px;
    font-size: 16px;
}

input[type="text"], input[type="email"], select, input[type="file"] {
    padding: 10px;
    font-size: 14px;
    margin-top: 5px;
    border: 1px solid #ccc;
    border-radius: 5px;
}

.radio-group {
    margin-top: 5px;
    display: flex;
    gap: 10px;
}

.dob-group {
    display: flex;
    gap: 10px;
    margin-top: 5px;
}

.dob-group select {
    flex: 1;
}

.photo-preview {
    margin-top: 10px;
    width: 150px;
    height: 150px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-size: cover;
    background-position: center;
}

/* Button */
button {
    margin-top: 20px;
    padding: 10px;
    font-size: 16px;
    background-color: #0078d4;
    color: white;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

button:hover {
    background-color: #005bb5;
}
// Populate Day, Month, and Year dropdowns
window.onload = function () {
    let daySelect = document.getElementById('day');
    let monthSelect = document.getElementById('month');
    let yearSelect = document.getElementById('year');

    for (let i = 1; i <= 31; i++) {
        daySelect.add(new Option(i, i));
    }

    for (let i = 1; i <= 12; i++) {
        monthSelect.add(new Option(i, i));
    }

    let currentYear = new Date().getFullYear();
    for (let i = 1900; i <= currentYear; i++) {
        yearSelect.add(new Option(i, i));
    }
};

// Photo Upload Preview
document.getElementById('photo').addEventListener('change', function (event) {
    const file = event.target.files[0];
    if (file) {
        const reader = new FileReader();
        reader.onload = function (e) {
            document.getElementById('photoPreview').style.backgroundImage = `url(${e.target.result})`;
        };
        reader.readAsDataURL(file);
    }
});

// Handle Next Button
document.getElementById('nextButton').addEventListener('click', function () {
    let name = document.getElementById('name').value;
    let contact = document.getElementById('contact').value;
    let email = document.getElementById('email').value;
    let gender = document.querySelector('input[name="gender"]:checked');
    let day = document.getElementById('day').value;
    let month = document.getElementById('month').value;
    let year = document.getElementById('year').value;

    if (!name || !contact || !email || !gender || !day || !month || !year) {
        alert('Please fill all fields!');
        return;
    }

    // Store Data in Local Storage (Example for Persistence)
    let studentData = {
        name,
        contact,
        email,
        gender: gender.value,
        dob: `${day}-${month}-${year}`,
    };

    localStorage.setItem('studentData', JSON.stringify(studentData));
    window.location.href = 'document_upload.html'; // Navigate to Document Upload Page
});
