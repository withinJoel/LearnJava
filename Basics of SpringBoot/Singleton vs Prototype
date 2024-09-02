# Prototype Scope
## Definition:

* A prototype scope means that a new instance of the bean is created each time it is requested. Each consumer gets a unique instance.
## Characteristics:

## Multiple Instances: A new instance is created every time the bean is requested from the application context.
## Memory Usage: Can consume more memory and resources since multiple instances may be created, especially if the bean is requested frequently.
## No Shared State: Each instance is independent, so changes to one instance do not affect others. This is useful for beans that need to maintain state that is unique per request or user.
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
