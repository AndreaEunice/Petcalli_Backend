package mx.petcalli.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.ProductController;
import mx.petcalli.app.model.Product;
import mx.petcalli.app.service.ProductService;


@CrossOrigin(origins = "*")
@RestController

public class ProductControllerImpl implements ProductController {

	private final ProductService productService;
	
	public ProductControllerImpl(ProductService productService) {
		this.productService = productService;	
		}
	
	
	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public ResponseEntity<Product> getProductByIdUsingResponseEntity(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("/api/v1/products")
	@Override
	public ResponseEntity<Set<Product>> getAllProducts() {
		Set<Product> products = productService.getAllProducts();
		return ResponseEntity.ok(products );
	}
	
	
	@Override
	public ResponseEntity<Product> createProduct(Product newProduct) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public ResponseEntity<Product> updateProduct(Product product, int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	@Override
	public ResponseEntity<Void> deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
