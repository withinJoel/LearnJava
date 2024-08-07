## Entity vs DAO
## Entity in Spring Boot
* In Spring Boot, an entity typically represents a data model class that maps to a database table. It is annotated with @Entity from the javax.persistence package to indicate that it is a JPA (Java Persistence API) entity. Example:
```
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    // Getters and setters, constructors
}
```
* Purpose: Entities in Spring Boot define the structure of the data that will be stored in the database. They typically represent tables or collections in a relational or NoSQL database.

* Annotations: Annotations like @Entity, @Table, @Id, @GeneratedValue, and @Column are used to define metadata about how the entity maps to the database schema.

## DAO (Data Access Object) in Spring Boot
