# Spring Boot Annotations
* Made with 💖 by Joel Jolly

## `build.gradle`

Here is an example of a `build.gradle` file for a Spring Boot project:

```
plugins {
    id 'org.springframework.boot' version '2.7.4'
    id 'io.spring.dependency-management' version '1.0.15.RELEASE'
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
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'mysql:mysql-connector-java'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

test {
    useJUnitPlatform()
}
```

## Key Spring Boot Annotations

### `@SpringBootApplication`
- **Use:** This is a combination of three annotations: `@EnableAutoConfiguration`, `@ComponentScan`, and `@Configuration`.
- **Placement:** Main application class.
```
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}
```

### `@Configuration`
- **Use:** Indicates that the class can be used by the Spring IoC container as a source of bean definitions.
- **Placement:** Configuration classes.
```
@Configuration
public class AppConfig {
    // Bean definitions
}
```

### `@ComponentScan`
- **Use:** Configures component scanning directives for use with `@Configuration` classes.
- **Placement:** Typically used in the main application class or configuration classes.
```
@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class MyApp {
}
```

### `@EnableAutoConfiguration`
- **Use:** Enables Spring Boot’s auto-configuration mechanism.
- **Placement:** Main application class.
```
@SpringBootApplication
@EnableAutoConfiguration
public class MyApp {
}
```

### `@RestController`
- **Use:** Combines `@Controller` and `@ResponseBody`. It indicates that the class is a controller where every method returns a domain object instead of a view.
- **Placement:** Controller classes.
```
@RestController
public class MyController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
```

### `@RequestMapping`
- **Use:** Maps HTTP requests to handler methods of MVC and REST controllers.
- **Placement:** Controller methods.
```
@RestController
public class MyController {
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet() {
        return "Greetings!";
    }
}
```

### `@Service`
- **Note:** `@Component` is a general-purpose Spring-managed bean, while `@Service` specifically denotes a service layer class that holds business logic.
- **Use:** Indicates that a class is a service. It’s used to mark the business logic classes.
- **Placement:** Service classes.
```
@Service
public class MyService {
    // Business logic
}
```
## Example usuage
```
@Service
public class CalculatorService {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}
```
### `@Component`
- **Note:** `@Component` is a general-purpose Spring-managed bean, while `@Service` specifically denotes a service layer class that holds business logic.
- **Use:** Indicates that a class is a Spring-managed component. It is used for general-purpose beans that don't fit into other specific categories.
- **Placement:** General-purpose classes.
```
@Component
public class MyComponent {
    // General-purpose logic
}
```
## Example usuage
```
@Component
public class CalculatorPrinter {
    private final CalculatorService calculatorService;

    public CalculatorPrinter(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public void printAddition(int a, int b) {
        int result = calculatorService.add(a, b);
        System.out.println("Addition result: " + result);
    }

    public void printSubtraction(int a, int b) {
        int result = calculatorService.subtract(a, b);
        System.out.println("Subtraction result: " + result);
    }
}
```
### `@Repository`
- **Use:** Indicates that the class provides the mechanism for storage, retrieval, search, update, and delete operation on objects.
- **Placement:** Repository classes.
```
@Repository
public class MyRepository {
    // Database access logic
}
```
## Example Usuage
```
package com.example.starship.repository;

import com.example.starship.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
```
### `@Entity`
- **Use:** Specifies that the class is an entity and is mapped to a database table.
- **Placement:** Model classes.
```
@Entity
public class MyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Other fields and methods
}
```
## Example Usuage
```
package com.example.starship.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;

    public User (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
```
### `@Autowired`
- **Use:** Enables automatic dependency injection.
- **Placement:** Fields, constructors, or methods in beans.
```
@Service
public class MyService {
    @Autowired
    private MyRepository myRepository;
}
```
