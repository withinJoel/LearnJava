# TeamSync
Made with 💖 by Joel Jolly.

# About
TeamSync is a comprehensive employee management and project tracking application designed to streamline the way you manage your workforce and projects. With TeamSync, you can effortlessly keep track of employee details, monitor the status of ongoing projects, and manage department information, all from a unified platform.

# Project Current Progress
1. Install Required Tools: ✅
   * Java ✅
   * IntelliJ ✅
   * MySql ✅
3. Create a New Spring Boot Project: ✅ 
4. Set Up Version Control: ✅
   * Github ✅ (Files are uploaded via GitKraken (For linux users) (Github Desktop for windows users)) (Note: If your individual files are less than 25 mb you can use github website on your browser for file uploading)
6. Design the Database Schema: ✅  (Mentioned in the later part of this readme)
7. Configure MySQL Connection: ✅ 
8. Create JPA Entities: ✅
9. Create Repository Interfaces: ✅ 
10. Implement the Service Layer: ✅ 
11. Create REST Controllers: ✅ 
12. Handle Validation: ✅ 
13. Test with Postman: ❌ (Have conducted few tests)
    * Able to get info from the backend.
15. Write Unit and Integration Tests: ✅ 
16. Implement Basic Security (Optional): ✅
  * (Secured in the HTML level)
15. Prepare Documentation: ✅ (Almost)
16. Deploy the Application: ❌ (Tried, but had issues deploying it) (Working on it)
17. Code Review and Feedback: Pending

# Screenshots
* Index page

![Screenshot from 2024-08-13 16-15-50](https://github.com/user-attachments/assets/184e26a5-ede0-4c51-bfe9-63a578a64f54)

* Employees page

![Screenshot from 2024-08-13 16-16-20](https://github.com/user-attachments/assets/bf514576-89d7-496c-88a7-85f8f9c73141)

* Department page

![Screenshot from 2024-08-13 16-16-27](https://github.com/user-attachments/assets/1a7e38b2-d3ec-458b-a32f-4e520b617f5c)

* Project page

![Screenshot from 2024-08-13 16-16-33](https://github.com/user-attachments/assets/7d68f10b-aabf-4f47-8e50-1cf9a06dc67e)

* About page

![Screenshot from 2024-08-14 12-52-47](https://github.com/user-attachments/assets/ffabbb7e-234a-47d5-89e3-32ce571c6d1d)

# To get started
* Create a database
```
CREATE DATABASE teamsync;
```
* Enter inside the database
```
USE teamsync_db;
```

* Create a table called `department`

```
CREATE TABLE department (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL
);
```

* Create a table called `employee`
```
CREATE TABLE employee (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  department_id BIGINT,
  FOREIGN KEY (department_id) REFERENCES department(id)
);
```
* Create a table called `project`
```
CREATE TABLE project (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  description TEXT,
  employee_id BIGINT,
  FOREIGN KEY (employee_id) REFERENCES employee(id)
);
```
* Update the `application.properties`
```
spring.application.name=teamsync
spring.datasource.url=jdbc:mysql://localhost:3306/teamsync  //replace teamsync with your database name.
spring.datasource.username=root  //mysql name
spring.datasource.password=test123!  //mysql password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
* Paste the repo code inside the intellij project folder. (Before doing this create a new project using intellij and then close the intellij app and then paste the code from this repo)
* Run the `build.gradle` (To install the packages)
* Run the code.

# Testing
* There are testing code that is present in the `Test` folder.

# Testing using Postman
* First create an account in the postman site (<a href="https://www.postman.com/">https://www.postman.com/</a>)
* Install the Postman cli or an Postman desktop app. (If you are an Linux user type `sudo snap install postman`

![Screenshot from 2024-08-14 13-17-08](https://github.com/user-attachments/assets/94f1f65e-e2f6-41a9-a1e7-1600d50d991c)
* Then run the cli or the app.
* In the browser go to the website (<a href="https://www.postman.com/">https://www.postman.com/</a>) and click on `New Request` (If you are using cli)(if not use the installed application)

![Screenshot from 2024-08-14 13-15-02](https://github.com/user-attachments/assets/05300a59-bdaf-4b49-9db5-cad85705cb02)

* Example:

![image](https://github.com/user-attachments/assets/b7c63af5-5643-42b8-b9a2-a6caffc4a127)

# Want help use my Java & Springboot basics course (It's free)
* https://github.com/withinJoel/LearnJava

# Support Me
If you love TeamSync and want to keep me caffeinated for more awesome updates, consider buying me a coffee!

[![Buy Me a Coffee](https://img.shields.io/badge/Buy%20Me%20a%20Coffee-Donate-orange?style=for-the-badge&logo=buy-me-a-coffee)](https://www.buymeacoffee.com/withinjoel)

Made with 💖 by Joel Jolly.
