package mx.petcalli.app.service;

import java.util.Set;

import org.springframework.data.domain.Page;

import mx.petcalli.app.model.Product;

public interface ProductService {

	Product createProduct(Product product);
	Product getProductById(Integer id);
	Product getProductByTitle(String title);
	Product getProductByBrand(String brand);
	Product getProductByFk1(String fk1);
	Product getProductByImage(String image);
	Product getProductByPrice(Double price);
	Product getProductByDescription(String description);
	Product getProductByFk2(String fk2);
	Product getProductByColor(String color);
	Product getProductBySize(String size);
	
	Set<Product> getAllProducts();
	
	Page<Product> getAllProducts(int pageNumber, int pageSize);
	Product updateProduct(Product product, Integer id);
	void Product(Integer id);
	
	
}
