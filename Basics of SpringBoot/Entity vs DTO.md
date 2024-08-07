## Entity vs DTO

## Entity in Spring Boot
* An entity in Spring Boot represents a persistent domain object that is typically mapped to a database table using an ORM (Object-Relational Mapping) framework like Hibernate.

## Characteristics
* An entity class is usually annotated with @Entity, marking it as a JPA (Java Persistence API) entity managed by the ORM. It contains fields that map to columns in the database table, often annotated with @Id, @GeneratedValue, @Column, etc.
```
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private double price;
    
    // Getters and setters
}
```
## DTO in Spring Boot
* DTOs in Spring Boot are used for transferring data between layers or subsystems, typically across network boundaries.

## Characteristics
* A DTO is a plain Java object that typically contains fields and getters/setters for transferring data between different parts of the application. It is lightweight and does not contain business logic.
```
public class ProductDTO {
    private Long id;
    private String name;
    private double price;
    
    // Getters and setters
}
```
## Usage in Spring Boot
* Entity Usage: Entities are used within the persistence layer of a Spring Boot application, typically managed by repositories that extend JpaRepository or similar interfaces. They represent domain objects that are persisted in the database.

* DTO Usage: DTOs are used at the boundaries of the application, such as in REST controllers (@RestController), where they facilitate data transfer between the client and the backend services. They help to encapsulate data and avoid exposing internal entity structures.

## Mapping Between Entity and DTO
* In a Spring Boot application, mapping between entities and DTOs is often necessary to manage data flow between different layers of the application.
* Manual Mapping Example
```
public class ProductMapper {
    
    public static ProductDTO toDto(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        return dto;
    }
    
    public static Product toEntity(ProductDTO dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        return product;
    }
}
```
* Using ModelMapper Example
```
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    private final ModelMapper modelMapper;

    public ProductMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ProductDTO toDto(Product product) {
        return modelMapper.map(product, ProductDTO.class);
    }

    public Product toEntity(ProductDTO productDTO) {
        return modelMapper.map(productDTO, Product.class);
    }
}
```
