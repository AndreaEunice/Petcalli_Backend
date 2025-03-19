package mx.petcalli.app.service;

import org.springframework.data.domain.Page;

import mx.petcalli.app.model.Product;

public interface ProductService {
 
 Product createProduct(Product product);
 
 Product getProductById(int id);
 
 Product getProductByTitle(String title);
 
 Product getProductByBrand(String brand);
 
 Product getProductByImage(String image);
 
 Product getProductByPrice(Double price);
 
 Product getProductByDescription(String description);
 
 Product getProductByColor(String color);
 
 Product getProductBySize(String size);
 
 Iterable<Product> getAllProducts();
 
 // Iterable<Product> getAllProductsByPetType(int petType);
 
 // Iterable<Product> getAllProductsByProductCategory(int productCategory);
 
 Product updateProduct(Product product, int id); 
  
 void deleteProduct(int id);

 Page<Product> getAllProducts(int pageNumber, int pageSize);

 // Product getProductByPetType(int petType);
 
}