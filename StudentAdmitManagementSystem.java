<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Admit Management System</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <header>
            <h1>Student Admit Management System</h1>
        </header>
        <!-- Login Form -->
        <div class="login-form">
            <h2>Login</h2>
            <form id="login-form">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>

                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>

                <button type="submit">Login</button>
            </form>
            <p id="error-message" class="error-message"></p>
        </div>

        <!-- Admin Dashboard -->
        <div id="admin-dashboard" class="dashboard hidden">
            <h2>Admin Dashboard</h2>
            <p>Welcome Admin! Here you can manage student applications.</p>
        </div>

        <!-- Student Dashboard -->
        <div id="student-dashboard" class="dashboard hidden">
            <h2>Student Dashboard</h2>
            <p>Welcome Student! You can view your application status here.</p>
        </div>
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
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    color: #333;
}

.container {
    width: 100%;
    max-width: 600px;
    margin: 0 auto;
    padding: 20px;
    text-align: center;
}

header h1 {
    font-size: 2em;
    margin-bottom: 20px;
}

.login-form {
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.login-form h2 {
    margin-bottom: 15px;
}

.login-form input {
    width: 100%;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ddd;
    border-radius: 5px;
}

.login-form button {
    width: 100%;
    padding: 10px;
    background-color: #4682b4;
    color: white;
    border: none;
    border-radius: 5px;
    font-size: 1em;
}

.error-message {
    color: red;
    margin-top: 10px;
}

.dashboard {
    display: none;
}

.dashboard.hidden {
    display: none;
}

.dashboard h2 {
    margin-bottom: 15px;
}

.dashboard p {
    font-size: 1.2em;
}
document.getElementById('login-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    const students = {
        "student1": "password1",
        "student2": "password2"
    };

    const admins = {
        "admin1": "adminpassword1",
        "admin2": "adminpassword2"
    };

    const errorMessage = document.getElementById('error-message');

    if (students[username] && students[username] === password) {
        // Student login successful
        document.querySelector('.login-form').style.display = 'none';
        document.getElementById('student-dashboard').style.display = 'block';
        errorMessage.style.display = 'none';
    } else if (admins[username] && admins[username] === password) {
        // Admin login successful
        document.querySelector('.login-form').style.display = 'none';
        document.getElementById('admin-dashboard').style.display = 'block';
        errorMessage.style.display = 'none';
    } else {
        errorMessage.textContent = 'Invalid username or password!';
        errorMessage.style.display = 'block';
    }
});
