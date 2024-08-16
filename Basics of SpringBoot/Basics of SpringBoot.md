# Spring Boot with Java: Quick Start Guide
* Made with 💖 Joel Jolly
* This guide will help you create a basic Spring Boot project with a simple JSP view. Follow the steps to set up and run your first Spring Boot application.

## 1. Create a New Project in IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Go to `File` > `New` > `Project`.
3. In the `New Project` window:
   - Select `Spring Initializr`.
   - Click `Next`.

## 2. Configure the Project Settings

1. In the `Project Metadata` section:
   - **Group:** `com.example`
   - **Artifact:** `demo`
   - **Name:** `demo`
   - **Type:** `Gradle Project`
   - **Language:** `Java`
2. Click `Next`.

## 3. Gradle Project Directory Structure

Here is a typical directory structure for a Spring Boot project using Gradle:

```
MySpringBootApp/
 ├── build.gradle
 ├── settings.gradle
 ├── src/
 │    ├── main/
 │    │    ├── java/
 │    │    │    └── com/
 │    │    │        └── example/
 │    │    │            ├── MyApp.java        # Main application class
 │    │    │            ├── config/
 │    │    │            │    └── AppConfig.java  # Configuration classes
 │    │    │            ├── controller/
 |    |    |            |    └── MyController.java  # Controller classes
 |    |    |            ├── dto/
 │    │    │            │    └── UserDTO.java  # Data Transfer Objects classes
 │    │    │            ├── service/
 │    │    │            │    └── MyService.java  # Service classes
 │    │    │            ├── repository/
 │    │    │            │    └── MyRepository.java  # Repository classes (This can also be called as `DAO` - Direct Access Objects.
 │    │    │            └── model/
 │    │    │                └── MyEntity.java  # Model classes
 │    │    └── resources/
 │    │        ├── application.properties  # Configuration properties
 │    │        └── static/  # Static resources (e.g., HTML, CSS)
 │    │        └── templates/  # Template files (e.g., Thymeleaf)
 │    └── test/
 │        └── java/
 │            └── com/
 │                └── example/
 │                    └── MyAppTests.java  # Test classes
 └── gradle/
      └── wrapper/
          ├── gradle-wrapper.jar
          └── gradle-wrapper.properties
```
## Architecture of the Code
![spring-boot-architecture2](https://github.com/user-attachments/assets/3fcc5981-f280-4de1-9b58-7bb3df9b61b5)

* MainClass (The first default class that will start the app)
* Controller layer - Just gives commands to the service layer (No code at all just call the service layer for the task)
* Service layer - For the tasks that is given by the controller (The main code for all the tasks that are give n by the controller)
   * Model layer - The service layer will give the model of the database and the service layer will give the data from the controller both combined will be given to the Repository layer.
* Repository layer - For all the Database based activity (Only if there is a database)

![spring-boot-architecture](https://github.com/user-attachments/assets/6c519ed2-973c-42d5-b344-e3a074015d30)
## Explanation:

* `MyApp.java`
* Functionality: Main entry point of the application.
* What should be present: Typically initializes the application context and starts the main application logic.
* What should not be present: Business logic or detailed implementation of specific functionalities.
* Example:
```java
package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
```
* `config/`
* Functionality: Contains application configuration classes.
* What should be present: Classes that configure various aspects of the application (e.g., database configuration, security configuration).
* What should not be present: Business logic, controller logic, or data access code.
 * Example:
```
package com.example.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest().authenticated()
            .and()
            .formLogin();
    }
}
```

* `dto/`
* Functionality: Contains classes that are used to transfer data between different layers of an application.
* What should be present: Plain classes or records that encapsulate data without any business logic. These classes typically include fields and their getters and setters or properties. They are often used to simplify data transfer and ensure that only necessary data is exposed.
* What should not be present: Business logic, validation, or database access code. DTOs should not contain methods that manipulate data or interact with the database.
* Example:
```
package com.example.myapp.dto;

public class UserDTO {
    private String username;
    private String email;

    // Getters and setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
```
* `controller/`
* Functionality: Houses controller classes.
* What should be present: Classes that handle incoming HTTP requests, process input, and invoke service layer methods.
* What should not be present: Detailed business logic (which should reside in service layer), data access code, or presentation-specific code beyond handling requests.
* Example:
```
package com.example.myapp.controller;

import com.example.myapp.dto.UserDTO;
import com.example.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public UserDTO getUser(@RequestParam String username) {
        return userService.getUserByUsername(username);
    }
}
```
* `service/`
* Functionality: Contains service layer classes.
* What should be present: Classes that encapsulate business logic and orchestrate data access through repositories.
* What should not be present: Direct interaction with HTTP requests (handled by controllers), database queries (handled by repositories), or application configuration (handled by config classes).
* Example:
```
package com.example.myapp.service;

import com.example.myapp.dto.UserDTO;
import com.example.myapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO getUserByUsername(String username) {
        // Business logic to fetch user
        return userRepository.findByUsername(username);
    }
}
```
* `repository/`
* Functionality: Houses repository classes.
* What should be present: Classes responsible for database interactions (e.g., CRUD operations).
* What should not be present: Business logic (handled by service layer), configuration details (handled by config classes), or HTTP request handling (handled by controllers).
* Example:
```
package com.example.myapp.repository;

import com.example.myapp.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO, Long> {
    UserDTO findByUsername(String username);
}
```
* `model/`
* Functionality: Contains entity classes representing data structures.
* What should be present: Plain Old Java Objects (POJOs) representing domain entities with fields and their getters/setters.
* What should not be present: Logic beyond basic data handling (e.g., business logic, complex validation logic).
* Example:
```
package com.example.myapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String email;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
```
## 4. Select Dependencies

1. In the `Dependencies` section, add the following:
   - **Spring Web**
2. Click `Next`, then `Finish`.

## 5. Configure Gradle Build Script

1. IntelliJ IDEA will create the project structure and a `build.gradle` file.
2. Open the `build.gradle` file and ensure it includes the necessary dependencies and plugins:

    ```groovy
    plugins {
        id 'org.springframework.boot' version '2.7.1'
        id 'io.spring.dependency-management' version '1.0.11.RELEASE'
        id 'java'
    }

    group = 'com.example'
    version = '0.0.1-SNAPSHOT'
    sourceCompatibility = '17'

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation 'org.springframework.boot:spring-boot-starter-web'
        implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
        testImplementation 'org.springframework.boot:spring-boot-starter-test'
    }

    tasks.named('test') {
        useJUnitPlatform()
    }
    ```

## 6. Create Controller and View

### Create a Controller

1. In `src/main/java/com/example/demo`, create a new package named `controller`.
2. Inside the `controller` package, create a new Java class named `HomeController.java`:

    ```java
    package com.example.demo.controller;

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "index";
        }
    }
    ```

### Create a JSP View

1. Create a directory named `webapp` under `src/main` (i.e., `src/main/webapp`).
2. Inside `webapp`, create a subdirectory named `WEB-INF`.
3. Create a file named `index.jsp` in `src/main/webapp/WEB-INF`:

    ```jsp
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <!DOCTYPE html>
    <html>
    <head>
        <title>Home Page</title>
    </head>
    <body>
        <h1>Welcome to the Spring Boot JSP Example!</h1>
    </body>
    </html>
    ```

## 7. Configure Spring Boot for JSP

1. Open `src/main/resources/application.properties`.
2. Add the following lines to configure the JSP view resolver:

    ```properties
    spring.mvc.view.prefix=/WEB-INF/
    spring.mvc.view.suffix=.jsp
    ```

## 8. Run the Application

1. Run your Spring Boot application by clicking the green `Run` button in IntelliJ IDEA.
2. Alternatively, you can run the application from the terminal:

    ```sh
    ./gradlew bootRun
    ```

## 9. Access the Application

1. Open your web browser.
2. Navigate to `http://localhost:8080`.
3. You should see the message "Welcome to the Spring Boot JSP Example!".

## Additional Tips and Tricks

- **Spring Boot DevTools**: Add `implementation 'org.springframework.boot:spring-boot-devtools'` to your dependencies for automatic restarts and live reload during development.

- **Customizing Port**: Change the default port by adding `server.port=8081` (or any other port number) in `application.properties`.

- **Logging**: Configure logging levels in `application.properties` using `logging.level.org.springframework=DEBUG` for more detailed logs during development.

- **Spring Boot Actuator**: Add `implementation 'org.springframework.boot:spring-boot-starter-actuator'` to include production-ready features such as monitoring and management.

- **Profiles**: Use Spring Profiles to manage different configurations for different environments (e.g., development, testing, production). Define profiles in `application-dev.properties`, `application-test.properties`, etc., and activate them using `spring.profiles.active=dev` in `application.properties`.

- **Error Handling**: Create custom error pages by adding a file like `error.html` in the `src/main/resources/templates` directory and configuring it in `application.properties`:

    ```properties
    server.error.whitelabel.enabled=false
    ```

## Example: Running a Simple Spring Boot Application

Here's a step-by-step example to run a simple Spring Boot application that displays "Hello, World!" in the browser.

### Create a New Controller

1. Create a new Java class named `HelloController.java` in the `controller` package:

    ```java
    package com.example.demo.controller;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloController {

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, World!";
        }
    }
    ```

### Run the Application

1. Ensure your Spring Boot application is running.
2. Open your web browser.
3. Navigate to `http://localhost:8080/hello`.
4. You should see the message "Hello, World!".

## Learning Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [Thymeleaf Documentation](https://www.thymeleaf.org/documentation.html)

Feel free to expand this guide with more details and examples as you continue learning!

------------------------------------------------------------------------------------------------------------------
## Install MySQL in linux using the terminal
* `sudo apt update`
* `sudo apt install mysql-server mysql-client`
* `sudo mysql_secure_installation` - Better go with `no` for all the statements by default or read it and decide for yourself.
* `sudo systemctl status mysql`
* `sudo mysql -u root -p`
* `sudo systemctl start mysql` - This step is mostly not required as it will start by default (Run this command in a new terminal)
