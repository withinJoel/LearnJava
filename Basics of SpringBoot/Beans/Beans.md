## Spring Boot Beans

### `@Bean`
- **Use:** Indicates that a method produces a bean to be managed by the Spring container.
- **Placement:** Methods within configuration classes.
```java
@Configuration
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyServiceImpl();
    }
}
```

### `@Component`
- **Use:** Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.
- **Placement:** Any Spring-managed class (e.g., service classes, DAOs).
```java
@Component
public class MyComponent {
    // Component logic
}
```

### `@Service`
- **Use:** Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state."
- **Placement:** Service classes.
```java
@Service
public class MyService {
    // Service logic
}
```

### `@Repository`
- **Use:** Indicates that an annotated class is a "Repository", originally defined by Domain-Driven Design (Evans, 2003) as "a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects".
- **Placement:** DAO (Data Access Object) classes.
```java
@Repository
public class MyRepository {
    // Repository logic
}
```

### `@Controller`
- **Use:** Indicates that an annotated class is a "Controller" (e.g., a web controller).
- **Placement:** Controller classes.
```
@Controller
public class MyController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
```

### `@RestController`
- **Use:** A convenience annotation that is itself annotated with `@Controller` and `@ResponseBody`.
- **Placement:** RESTful web service controller classes.
```
@RestController
public class MyRestController {
    @GetMapping("/api/home")
    public String home() {
        return "home";
    }
}
```

### `@Autowired`
- **Use:** Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities.
- **Placement:** Fields, constructors, or methods.
```
@Service
public class MyService {
    @Autowired
    private MyRepository myRepository;
}
```

### `@Qualifier`
- **Use:** When you need more control over the selection process of beans to be injected.
- **Placement:** Fields, constructors, or methods where `@Autowired` is used.
```
@Service
public class MyService {
    @Autowired
    @Qualifier("specificBean")
    private MyRepository myRepository;
}
```

### `@Scope`
- **Use:** Configures the scope of a bean.
- **Placement:** On classes or methods annotated with `@Bean`.
```
@Service
@Scope("prototype")
public class MyPrototypeService {
    // Service logic
}
```

## Bean Scopes

- **Singleton:** (Default) Scopes a single bean definition to a single object instance per Spring IoC container.
- **Prototype:** Scopes a single bean definition to any number of object instances.
- **Request:** Scopes a single bean definition to the lifecycle of a single HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
- **Session:** Scopes a single bean definition to the lifecycle of an HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.
- **Global Session:** Scopes a single bean definition to the lifecycle of a global HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.