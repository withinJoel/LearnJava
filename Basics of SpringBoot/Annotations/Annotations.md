# Spring Boot Annotations and Gradle Project Structure

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