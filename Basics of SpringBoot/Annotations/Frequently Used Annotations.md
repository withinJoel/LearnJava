# Frequently Used Annotations
## `@SpringBootApplication:`
* This annotation is typically placed on the main class of a Spring Boot application.
* It combines multiple annotations, including @Configuration @EnableAutoConfiguration and @ComponentScan
* It indicates that this class is the entry point for your Spring Boot application.
## @Controller:
* Used to define a class as a controller in a Spring MVC application.
* Controllers handle incoming HTTP requests and return responses.
* Methods within a @Controller class are often annotated with @RequestMapping or other request mapping annotations to specify the URL endpoints they handle.
## @RestController:
* Similar to @Controller, but it combines @Controller and @ResponseBody.
* It’s used for creating RESTful web services that return JSON or XML responses directly from the methods.
## @RequestMapping:
* Specifies the URL mapping for a controller method.
* It can be used at the class level to define a base URL for all methods within the controller.
* You can specify HTTP request methods, such as GET, POST, PUT, or DELETE, and URL paths.
## @PostMapping:
* The @PostMapping annotation is used to map HTTP POST requests to a specific controller method in a Spring application.
* When a client sends an HTTP POST request to a specific URL, Spring will route that request to the controller method annotated with @PostMapping if the URL matches the one specified in the method's mapping.
* This annotation is commonly used for creating or updating resources on the server. For example, you might use @PostMapping to handle the submission of a form on a web page or to create a new record in a database.
## @GetMapping:
* The @GetMapping annotation is used to map HTTP GET requests to a specific controller method in a Spring application.
* When a client sends an HTTP GET request to a specific URL, Spring will route that request to the controller method annotated with @GetMapping if the URL matches the one specified in the method's mapping.
* This annotation is commonly used for retrieving data or resources from the server without altering them. For example, you might use @GetMapping to retrieve a list of items from a database or to display a web page.
## @PathVariable:
* Used to bind a method parameter to a template variable in a URI.
* It’s often used in RESTful APIs to capture values from the URL and pass them as method arguments.
## @RequestParam:
* Binds a request parameter to a method parameter in a controller method.
* It’s used to access query parameters from the URL.
## @Autowired:
* Marks a constructor, field, or setter method for automatic dependency injection.
* Spring Boot will automatically inject the required dependency bean at runtime.
## @Service, @Repository, @Component:
- These annotations are used to define beans that Spring Boot should manage and inject into other parts of the application.
- @Service is typically used for services, @Repository for data access components, and @Component for general beans.
@Configuration:
- Indicates that a class defines Spring configuration, often used in conjunction with @Bean.
- Methods annotated with @Bean inside a @Configuration class define Spring beans.
@EnableAutoConfiguration:
- Enables Spring Boot’s auto-configuration feature.
- It automatically configures various beans and components based on the dependencies present in your project.
@Value:
- Injects values from properties files or environment variables into bean properties.
- It’s commonly used for configuring application properties.
@ConfigurationProperties:
- Used to bind external properties from application configuration files (e.g., application.properties or application.yml) to Java objects.
- It simplifies the process of externalizing configuration properties.
@EnableScheduling:
- Enables scheduling of tasks using the @Scheduled annotation.
- Useful for creating scheduled jobs or tasks within your Spring Boot application.
@Entity , @Table, @Column (JPA Annotations):
-Used for defining entities, tables, and columns in a database when working with Java Persistence API (JPA) and Hibernate.
@JsonFormat:
- Allows you to customize the serialization format of date and time fields in JSON responses.
