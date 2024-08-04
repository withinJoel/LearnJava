# Spring Boot Annotations and Gradle Project Structure

## Key Spring Boot Annotations

### Folder Structure
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
