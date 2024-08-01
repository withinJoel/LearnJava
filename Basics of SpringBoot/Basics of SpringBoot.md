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

## 3. Select Dependencies

1. In the `Dependencies` section, add the following:
   - **Spring Web**
2. Click `Next`, then `Finish`.

## 4. Configure Gradle Build Script

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

## 5. Create Controller and View

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

## 6. Configure Spring Boot for JSP

1. Open `src/main/resources/application.properties`.
2. Add the following lines to configure the JSP view resolver:

    ```properties
    spring.mvc.view.prefix=/WEB-INF/
    spring.mvc.view.suffix=.jsp
    ```

## 7. Run the Application

1. Run your Spring Boot application by clicking the green `Run` button in IntelliJ IDEA.
2. Alternatively, you can run the application from the terminal:

    ```sh
    ./gradlew bootRun
    ```

## 8. Access the Application

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
