# Singleton Scope
## Definition:

* A singleton scope means that only one instance of a bean is created and used throughout the entire application context. This instance is shared across the application.
## Characteristics:

* Single Instance: Only one instance of the bean is created, and this instance is reused throughout the application.
* Memory Efficiency: It saves memory and resources since only one instance is created and managed.
* Shared State: Any state or changes to the bean are shared across all consumers. This can be problematic if the bean maintains mutable state, as changes can affect all parts of the application using the bean.
## Use Cases:

* Stateless Beans: Ideal for beans that are stateless or where shared state is acceptable.
* Performance: Useful for beans that are expensive to create, such as database connections or configuration objects.
## example
```
@Component
@Scope("singleton")
public class SingletonBean {
    // Bean instance is shared across the application context
}
```
# Prototype Scope
## Definition:

* A prototype scope means that a new instance of the bean is created each time it is requested. Each consumer gets a unique instance.
## Characteristics:

* Multiple Instances: A new instance is created every time the bean is requested from the application context.
* Memory Usage: Can consume more memory and resources since multiple instances may be created, especially if the bean is requested frequently.
* No Shared State: Each instance is independent, so changes to one instance do not affect others. This is useful for beans that need to maintain state that is unique per request or user.
## Use Cases:
* Stateful Beans: Ideal for beans that need to maintain unique state for each consumer or interaction.
* Transient Beans: Useful when beans are short-lived and their state should not be shared.
## example
```
@Component
@Scope("prototype")
public class PrototypeBean {
    // A new instance is created each time the bean is requested
}
```
