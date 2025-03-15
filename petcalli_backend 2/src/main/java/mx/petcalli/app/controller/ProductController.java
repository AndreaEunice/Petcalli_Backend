package mx.petcalli.app.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.model.Product;

public interface ProductController {

	Product getProductById(Double id);
	ResponseEntity<Product> getProductByIdUsingResponseEntity(Long id);
	
	// Set<Product>getAllProducts();
	ResponseEntity< Set<Product>> getAllProducts();
	
	ResponseEntity<Product> createProduct(Product newProduct);
	ResponseEntity<Product> updateProduct(Product product, Long id);
	ResponseEntity<Void> deleteProduct(Double id); // 204 no hay contenido en la respuesta
	
	
	
	
	
}
