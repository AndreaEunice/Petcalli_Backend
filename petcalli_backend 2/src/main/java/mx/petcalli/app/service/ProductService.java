package mx.petcalli.app.service;

import org.springframework.data.domain.Page;

import mx.petcalli.app.model.Product;

public interface ProductService {
 
 Product createProduct(Product product);
 
 Product getProductById(int id);
 
 Iterable<Product> getProductByTitle(String title);
 
 Iterable<Product> getProductByBrand(String brand);
 
 Iterable<Product> getProductByImage(String image);
 
 Iterable<Product> getProductByPrice(Double price);
 
 Iterable<Product> getProductByDescription(String description);
 
 Iterable<Product> getProductByColor(String color);
 
 Iterable<Product> getProductBySize(String size);
 
 Iterable<Product> getAllProducts();
 
 // Iterable<Product> getAllProductsByPetType(int petType);
 
 // Iterable<Product> getAllProductsByProductCategory(int productCategory);
 
 Product updateProduct(Product product, int id); 
  
 void deleteProduct(int id);

 Page<Product> getAllProducts(int pageNumber, int pageSize);

 // Product getProductByPetType(int petType);
 
}