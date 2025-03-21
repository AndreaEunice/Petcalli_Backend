package mx.petcalli.app.controller;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.model.Product;

public interface ProductController {

 ResponseEntity<Product> getProductById(int id);
 
 // ResponseEntity<Iterable<Product>> getAllProductsByPetType(int petType);
 
 // ResponseEntity<Iterable<Product>> getAllProductsByProductCategory(int productCategory);
 
 ResponseEntity<Iterable<Product>> getAllProducts();
 
 ResponseEntity<Product> createProduct(Product product);
 
 ResponseEntity<Product> updateProduct(Product product);
 
 ResponseEntity<Void> deleteProduct(int id);

ResponseEntity<Product> updateProduct(Product product, int id);

 
 
 
 
 
}