package mobile.app.controller.impl;

import java.util.List;

import mobile.app.controller.RestService;
import mobile.app.model.Product;
import mobile.app.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@EnableMongoRepositories({"mobile.app.repository"}) 
public class RestServiceImpl implements RestService {

	@Autowired
	private ProductRepository productRepository;

	//TODO Falta capa de negocios
	
	@Override
	@RequestMapping("/get")
	public List<Product> getProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	@RequestMapping("/insert")
	public void InsertProduct() {
		productRepository.save(new Product("heladera","Enfria Bocha"));
	}
	
}
