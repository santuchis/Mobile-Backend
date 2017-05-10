package mobile.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {
	
	@Id
    public String id;

    public String name;
    public String description;

    public Product() {}

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
