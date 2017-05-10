package mobile.app.controller;

import java.util.List;

import mobile.app.model.Product;

public interface RestService {

	List<Product> getProducts();
	
	void InsertProduct();

}
