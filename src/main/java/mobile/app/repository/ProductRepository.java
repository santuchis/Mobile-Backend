package mobile.app.repository;

import mobile.app.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
	
}
