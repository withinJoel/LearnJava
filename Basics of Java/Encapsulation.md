## Encapsulation in Java
* Encapsulation is one of the four fundamental concepts of object-oriented programming (OOP). It refers to the bundling of data (attributes) and methods (functions) that operate on the data into a single unit called a class. In Java, encapsulation is achieved by declaring the class fields (attributes) as private and providing public methods (getters and setters) to access or modify these fields.

## Example Class without Encapsulation
```
public class User {
    public String username;
    public String password;
}
```
* In this example:

* username and password are declared as public fields.
* There's no encapsulation; fields can be directly accessed and modified from outside the class.
## Refactoring with Encapsulation using Getters and Setters
* `user.java`
```
public class User {
    private String username;
    private String password;

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
```
## Explanation:
1. Private Fields:

* username and password are declared as private. This restricts direct access to these fields from outside the User class.
2. Getters:

* getUsername() and getPassword() methods are public. They provide read access (get) to the private fields username and password, respectively.
3. Setters:

* setUsername(String username) and setPassword(String password) methods are public. They provide write access (set) to the private fields username and password, respectively.

## Benefits of Encapsulation:
* Controlled Access: Fields are accessed and modified through methods (getters and setters), allowing validation, calculations, or any other logic to be applied.

* Flexibility: Internal implementation details (like field names, data validation, etc.) can be changed without affecting the external interface of the class.

* Security: By making fields private, you prevent unintended modification or access to sensitive data.
* Example Usuage
```
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("John");
        user.setPassword("password123");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());

        // Attempt to modify directly (which is not possible due to private fields)
        // user.username = "Jane"; // This will cause a compilation error
    }
}
```
* In this example:

* We create a User object and set its username and password using the setter methods.
* We retrieve and print the values using the getter methods.
* Attempting to modify username directly (user.username = "Jane";) would result in a compilation error because username is private.
## Conclusion:
* Encapsulation in Java is a fundamental principle that promotes secure and maintainable code by hiding implementation details and providing controlled access to class fields through getters and setters. This approach enhances code reusability, flexibility, and security in object-oriented programming.
