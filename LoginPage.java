<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="login-container">
        <h1>Student Admit Management System</h1>
        <form action="login" method="post">
            <div class="user-type">
                <label>
                    <input type="radio" name="userType" value="student" required> Student
                </label>
                <label>
                    <input type="radio" name="userType" value="admin"> Admin
                </label>
            </div>
            <div class="input-field">
                <label for="username">Name:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="input-field">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit">Next</button>
        </form>
    </div>
</body>
</html>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f9f2ee;
}

.login-container {
    max-width: 400px;
    margin: 100px auto;
    padding: 20px;
    background-color: #ffffff;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    text-align: center;
}

h1 {
    font-size: 24px;
    margin-bottom: 20px;
}

.user-type {
    margin-bottom: 20px;
    text-align: left;
}

.user-type label {
    display: block;
    margin: 5px 0;
}

.input-field {
    margin-bottom: 15px;
    text-align: left;
}

.input-field label {
    display: block;
    margin-bottom: 5px;
    font-weight: bold;
}

.input-field input {
    width: 100%;
    padding: 8px;
    margin-top: 5px;
    border: 1px solid #ccc;
    border-radius: 4px;
}

button {
    background-color: #4caf50;
    color: white;
    padding: 10px 15px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
}

button:hover {
    background-color: #45a049;
}
package mainPackage;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private HashMap<String, String> studentData;
    private HashMap<String, String> adminData;

    @Override
    public void init() throws ServletException {
        studentData = new HashMap<>();
        adminData = new HashMap<>();
        // Pre-populate with admin credentials
        adminData.put("admin1", "adminpassword1");
        adminData.put("admin2", "adminpassword2");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userType = request.getParameter("userType");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("student".equals(userType)) {
            if ("P@ssw0rd@#".equals(password)) {
                if (studentData.containsKey(username)) {
                    response.getWriter().println("Welcome back, Student " + username + "!");
                } else {
                    studentData.put(username, password);
                    response.getWriter().println("Welcome, New Student " + username + "!");
                }
            } else {
                response.getWriter().println("Invalid Student password");
            }
        } else if ("admin".equals(userType)) {
            if (adminData.containsKey(username) && adminData.get(username).equals(password)) {
                response.getWriter().println("Welcome, Admin " + username + "!");
            } else {
                response.getWriter().println("Invalid Admin credentials");
            }
        } else {
            response.getWriter().println("Please select Student or Admin");
        }
    }
}
