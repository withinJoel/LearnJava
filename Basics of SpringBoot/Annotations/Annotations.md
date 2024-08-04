
# Spring Boot Annotations and Gradle Project Structure

## Key Spring Boot Annotations

### `@SpringBootApplication`
- **Use:** This is a combination of three annotations: `@EnableAutoConfiguration`, `@ComponentScan`, and `@Configuration`.
- **Placement:** Main application class.
```java
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
```java
@Configuration
public class AppConfig {
    // Bean definitions
}
```

### `@ComponentScan`
- **Use:** Configures component scanning directives for use with `@Configuration` classes.
- **Placement:** Typically used in the main application class or configuration classes.
```java
@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class MyApp {
}
```

### `@EnableAutoConfiguration`
- **Use:** Enables Spring Boot’s auto-configuration mechanism.
- **Placement:** Main application class.
```java
@SpringBootApplication
@EnableAutoConfiguration
public class MyApp {
}
```

### `@RestController`
- **Use:** Combines `@Controller` and `@ResponseBody`. It indicates that the class is a controller where every method returns a domain object instead of a view.
- **Placement:** Controller classes.
```java
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
```java
@RestController
public class MyController {
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greet() {
        return "Greetings!";
    }
}
```

### `@Service`
- **Use:** Indicates that a class is a service. It’s used to mark the business logic classes.
- **Placement:** Service classes.
```java
@Service
public class MyService {
    // Business logic
}
```

### `@Repository`
- **Use:** Indicates that the class provides the mechanism for storage, retrieval, search, update, and delete operation on objects.
- **Placement:** Repository classes.
```java
@Repository
public class MyRepository {
    // Database access logic
}
```

### `@Entity`
- **Use:** Specifies that the class is an entity and is mapped to a database table.
- **Placement:** Model classes.
```java
@Entity
public class MyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Other fields and methods
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

## Gradle Project Directory Structure

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
 │    │    │            │    └── MyController.java  # Controller classes
 │    │    │            ├── service/
 │    │    │            │    └── MyService.java  # Service classes
 │    │    │            ├── repository/
 │    │    │            │    └── MyRepository.java  # Repository classes
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

## `build.gradle` Example

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

## `settings.gradle` Example

```
rootProject.name = 'MySpringBootApp'
```