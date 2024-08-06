## Common Errors in Springboot based Java Application

### Main Class
** The main class does not have any void, String, int, boolean nothing just public class alone without taking any inputs.
example: 
```
public class RegistrationService {
    public boolean login(String username, String password){
        return true;
    }
    public boolean register(String username, String email, String password){
        return true;
    }
}
```

### Anotations
* Always use an anotations based on the layer for the main class.
example: for controller layer
```
@Controller
public class AppController {
    //Your code
}
```
example: for service layer
```
@Service
public class RegistrationService {
    // Your code
}
```
here are even more: @Repository, @Entity....