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
* In Spring Boot, DAOs are used to provide a layer of abstraction over the database interactions. They typically use Spring Data JPA repositories or custom DAO implementations to perform CRUD operations and other database operations. Example using Spring Data JPA:
```
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    // Other custom queries if needed
}
```
* Purpose: DAOs encapsulate the logic for interacting with the database. They provide methods for querying and modifying data without exposing the details of the database access mechanism.

* Spring Data JPA: Spring Boot encourages the use of Spring Data JPA, which provides a powerful and convenient way to interact with databases using repository interfaces. It generates queries based on method names and allows you to define custom queries using JPQL (Java Persistence Query Language) or native SQL.  
