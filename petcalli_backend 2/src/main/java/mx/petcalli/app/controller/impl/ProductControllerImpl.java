package mx.petcalli.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import mx.petcalli.app.controller.ProductController;
import mx.petcalli.app.model.Product;

public class ProductControllerImpl implements ProductController {

	@Override
	public Product getProductById(Double id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Product> getProductByIdUsingResponseEntity(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/api/v1/products")
	@Override
	public ResponseEntity<Set<Product>> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Product> createProduct(Product newProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Product> updateProduct(Product product, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deleteProduct(Double id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
