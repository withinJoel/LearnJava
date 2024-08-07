# Java Spring Boot Controller Basics

## What is a Controller in Java Spring Boot?

In a Java Spring Boot application, a controller is responsible for handling incoming HTTP requests and returning appropriate responses. It plays a central role in implementing the MVC (Model-View-Controller) pattern.

## Responsibilities of a Controller:

1. **Request Mapping**: Maps HTTP requests to specific handler methods (controller methods).
2. **Request Handling**: Processes incoming requests and performs necessary operations.
3. **Response Generation**: Prepares and returns a response to the client (e.g., HTML, JSON).

## Components of a Basic Controller in Java Spring Boot:

A basic controller in Java Spring Boot typically includes:

- **Controller Class**: Annotated with `@Controller` or `@RestController`.
- **Request Mapping**: Annotations like `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` to map URLs to controller methods.
- **Method Parameters**:
  - `@RequestParam`: Retrieving query parameters.
  - `@PathVariable`: Extracting values from the URI path.
  - `@RequestBody`: Binding HTTP request body to a Java object.
  - `@RequestHeader`: Retrieving HTTP headers.
  - `@RequestAttribute`: Accessing request attributes.
- **Response Handling**: Returning views (HTML templates) or data (JSON/XML).

## Example Java Spring Boot Controller (Sample Code):

```java
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleController {

    // Handling GET request to /example
    @GetMapping
    public String index() {
        return "Hello, World!";
    }

    // Handling GET request to /example/{id}
    @GetMapping("/{id}")
    public String show(@PathVariable Long id) {
        return "Showing details for ID: " + id;
    }

    // Handling POST request to /example
    @PostMapping
    public String create(@RequestBody String data) {
        // Process 'data' (request body) and save to database
        return "Resource created successfully";
    }

    // Handling GET request to /example/search?query=example
    @GetMapping("/search")
    public String search(@RequestParam String query) {
        return "Search results for query: " + query;
    }

    // Handling GET request to /example/header with custom header
    @GetMapping("/header")
    public String customHeader(@RequestHeader("X-Example-Header") String headerValue) {
        return "Value of X-Example-Header: " + headerValue;
    }
}
```
## Explanation:
* `@RestController`: Annotation that combines @Controller and @ResponseBody. It indicates that this class is a controller and that each method returns a domain object instead of a view.
* `@RequestMapping`: Maps all HTTP operations by default to the /example URL path.
* `@GetMapping`: Handles HTTP GET requests.
* `@PostMapping`: Handles HTTP POST requests.
* `@RequestParam`: Annotation used to bind a method parameter to a web request parameter.
* `@PathVariable`: Annotation used to bind a method parameter to a URI template variable.
* `@RequestBody`: Annotation indicating a method parameter should be bound to the body of the HTTP request.
* `@RequestHeader`: Annotation used to bind a method parameter to a web request header.
* `@RequestAttribute`: Annotation used to access request attributes.

## Conclusion
Java Spring Boot controllers are essential for handling HTTP requests and orchestrating application logic. They provide a structured way to manage interactions between clients and the application, facilitating clean separation of concerns and robust request handling.
