<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Course Details</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container">
        <header>
            <h1>Course Details</h1>
        </header>
        
        <section class="selection-panel">
            <div class="form-group">
                <label for="colleges">Select College:</label>
                <select id="colleges" class="dropdown">
                    <option>RV College of Engineering (RVCE)</option>
                    <option>PES University (PESU)</option>
                    <option>BMS College of Engineering (BMSCE)</option>
                    <option>MS Ramaiah Institute of Technology (MSRIT)</option>
                    <option>Dayananda Sagar College of Engineering (DSCE)</option>
                    <option>Bangalore Institute of Technology (BIT)</option>
                    <option>New Horizon College of Engineering (NHCE)</option>
                    <option>Nitte Meenakshi Institute of Technology (NMIT)</option>
                    <option>Sir M. Visvesvaraya Institute of Technology (MVIT)</option>
                    <option>Christ University Faculty of Engineering</option>
                    <option>Jain University School of Engineering and Technology</option>
                    <option>CMR Institute of Technology (CMRIT)</option>
                    <option>Acharya Institute of Technology</option>
                    <option>RNS Institute of Technology (RNSIT)</option>
                    <option>East Point College of Engineering and Technology</option>
                    <option>BNM Institute of Technology (BNMIT)</option>
                    <option>BMS Institute of Technology and Management</option>
                    <option>Global Academy of Technology</option>
                    <option>Reva University</option>
                    <option>AMC Engineering College</option>
                    <option>Sapthagiri College of Engineering</option>
                    <option>Oxford College of Engineering</option>
                    <option>Sri Venkateshwara College of Engineering (SVCE)</option>
                    <option>Don Bosco Institute of Technology (DBIT)</option>
                    <option>Alpha College of Engineering</option>
                </select>
            </div>
            
            <div class="form-group">
                <label for="courses">Select Your Program:</label>
                <div class="courses">
                    <label><input type="checkbox" name="course" value="Computer Science and Engineering"> Computer Science and Engineering (CSE)</label>
                    <label><input type="checkbox" name="course" value="Electronics and Communication Engineering"> Electronics and Communication Engineering (ECE)</label>
                    <label><input type="checkbox" name="course" value="Electrical and Electronics Engineering"> Electrical and Electronics Engineering (EEE)</label>
                    <label><input type="checkbox" name="course" value="Mechanical Engineering"> Mechanical Engineering (ME)</label>
                    <label><input type="checkbox" name="course" value="Civil Engineering"> Civil Engineering</label>
                    <label><input type="checkbox" name="course" value="Information Technology"> Information Technology (IT)</label>
                    <label><input type="checkbox" name="course" value="Chemical Engineering"> Chemical Engineering</label>
                    <label><input type="checkbox" name="course" value="Aerospace Engineering"> Aerospace Engineering</label>
                    <label><input type="checkbox" name="course" value="Automobile Engineering"> Automobile Engineering</label>
                    <label><input type="checkbox" name="course" value="Biotechnology Engineering"> Biotechnology Engineering</label>
                    <label><input type="checkbox" name="course" value="Artificial Intelligence and Machine Learning"> Artificial Intelligence and Machine Learning (AI & ML)</label>
                    <label><input type="checkbox" name="course" value="Data Science and Engineering"> Data Science and Engineering</label>
                    <label><input type="checkbox" name="course" value="Cyber Security"> Cyber Security</label>
                    <label><input type="checkbox" name="course" value="Internet of Things"> Internet of Things (IoT)</label>
                    <label><input type="checkbox" name="course" value="Robotics and Automation"> Robotics and Automation</label>
                    <label><input type="checkbox" name="course" value="Mechatronics Engineering"> Mechatronics Engineering</label>
                    <label><input type="checkbox" name="course" value="Biomedical Engineering"> Biomedical Engineering</label>
                    <label><input type="checkbox" name="course" value="Environmental Engineering"> Environmental Engineering</label>
                    <label><input type="checkbox" name="course" value="Industrial and Production Engineering"> Industrial and Production Engineering</label>
                    <label><input type="checkbox" name="course" value="Materials Science and Metallurgical Engineering"> Materials Science and Metallurgical Engineering</label>
                    <label><input type="checkbox" name="course" value="Energy Engineering"> Energy Engineering</label>
                    <label><input type="checkbox" name="course" value="Renewable Energy Engineering"> Renewable Energy Engineering</label>
                    <label><input type="checkbox" name="course" value="Nanotechnology Engineering"> Nanotechnology Engineering</label>
                    <label><input type="checkbox" name="course" value="Mining Engineering"> Mining Engineering</label>
                    <label><input type="checkbox" name="course" value="Petroleum Engineering"> Petroleum Engineering</label>
                    <label><input type="checkbox" name="course" value="Marine Engineering"> Marine Engineering</label>
                    <label><input type="checkbox" name="course" value="Agricultural Engineering"> Agricultural Engineering</label>
                    <label><input type="checkbox" name="course" value="Software Engineering"> Software Engineering</label>
                    <label><input type="checkbox" name="course" value="Big Data Analytics"> Big Data Analytics</label>
                    <label><input type="checkbox" name="course" value="Embedded Systems Engineering"> Embedded Systems Engineering</label>
                </div>
            </div>
        </section>

        <footer>
            <button id="backButton" class="btn">Back</button>
            <button id="submitButton" class="btn">Submit</button>
        </footer>
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
    background-color: #f9f2ee;
    color: #000;
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
    color: #000;
}

.selection-panel {
    background-color: #f9f2ee;
    border-radius: 10px;
    padding: 20px;
    margin-bottom: 20px;
}

.form-group {
    margin-bottom: 20px;
}

label {
    font-size: 24px;
    font-weight: normal;
    color: #000;
}

select, .dropdown {
    width: 100%;
    padding: 10px;
    font-size: 16px;
    margin-top: 10px;
    border-radius: 5px;
    border: 1px solid #ddd;
}

.courses {
    max-height: 300px;
    overflow-y: auto;
}

.courses label {
    display: block;
    font-size: 16px;
    margin: 5px 0;
}

footer {
    display: flex;
    justify-content: space-between;
}

.btn {
    font-size: 20px;
    font-weight: bold;
    background-color: #5e81ac;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s;
}

.btn:hover {
    background-color: #81a1c1;
}

.btn:active {
    background-color: #4c6d8d;
}
document.getElementById("submitButton").addEventListener("click", function() {
    const college = document.getElementById("colleges").value;
    const courses = Array.from(document.querySelectorAll("input[name='course']:checked")).map(cb => cb.value);

    if (!college) {
        alert("Please select a college.");
    } else if (courses.length === 0) {
        alert("Please select at least one program.");
    } else {
        alert("College: " + college + "\nSelected Courses: " + courses.join(", "));
        // Here, you can send this data to the server or navigate to the next page
    }
});

document.getElementById("backButton").addEventListener("click", function() {
    window.history.back();  // This simulates the back button action
});
