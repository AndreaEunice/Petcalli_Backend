package mx.petcalli.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import mx.petcalli.app.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>, PagingAndSortingRepository<Product, Integer> { 

 Iterable<Product> findByTitle(String title);
 Iterable<Product> findByBrand(String brand);
 Iterable<Product> findByImage(String image);
 Iterable<Product> findByPrice(Double price);
 Iterable<Product> findByDescription(String description);
 Iterable<Product> findByColor(String color);
 Iterable<Product> findBySize(String size);
 // Iterable<Product> findAllProductsByPetTypeId(int petType);
 // Iterable<Product> findAllProductsByProductCategory(int productCategory);
 // Iterable<Product> findByPetType(int petType);
 // Iterable<Product> findByProductCategory(int productCategory);

}