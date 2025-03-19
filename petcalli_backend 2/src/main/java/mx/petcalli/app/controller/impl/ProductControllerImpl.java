package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.ProductController;
import mx.petcalli.app.model.Product;
import mx.petcalli.app.service.ProductService;


@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/products")
@RestController

public class ProductControllerImpl implements ProductController {

 private final ProductService productService;
 
 public ProductControllerImpl(ProductService productService) {
  this.productService = productService; 
  }
 
 
 @Override
 @GetMapping("{id}")
 public ResponseEntity<Product> getProductById(@PathVariable("id")int id) {
  return ResponseEntity.ok(productService.getProductById(id));
 }
 
 /*@Override
 @GetMapping("/productCategory/{id}")
 public ResponseEntity<Iterable<Product>> getAllProductsByPetType(@PathVariable("id") int petType){
  return ResponseEntity.ok( productService.getAllProductsByPetType(petType));
 } 
 
 @Override
 @GetMapping("/petType/{id}")
 public ResponseEntity<Iterable<Product>> getAllProductsByProductCategory(@PathVariable("id") int productCategory){
  return ResponseEntity.ok( productService.getAllProductsByProductCategory(productCategory));
 }*/
 
 @GetMapping
 @Override
 public ResponseEntity<Iterable<Product>> getAllProducts() {
  return ResponseEntity.ok(productService.getAllProducts() );
 }
 
 
 @Override
 @PostMapping
 public ResponseEntity<Product> createProduct(@RequestBody Product product) {
  return ResponseEntity.status(201).body( productService.createProduct(product) );
 }
 
 @Override
 @PutMapping("{id}")
 public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable("id")int id){
  return ResponseEntity.ok(productService.updateProduct(product, id));
  
 } 

 @Override
 @DeleteMapping("{id}")
 public ResponseEntity<Void> deleteProduct(int id) {
  productService.deleteProduct(id);
  return ResponseEntity.noContent().build();
 }




 
 
}