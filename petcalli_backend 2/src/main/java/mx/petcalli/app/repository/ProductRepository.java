package mx.petcalli.app.repository;

import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import mx.petcalli.app.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepository extends CrudRepository<Product, Integer>, PagingAndSortingRepository<Product, Integer> { // Preguntar si siemore sera Integer por el id.

	Set<Product> findByTitle(String title);
	Set<Product> findByBrand(String brand);
	//Set<Product> findByFk(Integer Fk);
	Set<Product> findByImage(String image);
	Set<Product> findByPrice(Double price);
	Set<Product> findByDescription(String description);
	//Set<Product> findByFk(Integer Fk);
	Set<Product> findBycolor(String color);
	Set<Product> findBysize(String size);

	Page<Product> findAllByActiveTrue(Pageable pageable);
	Page<Product> findAllByActiveFalse(Pageable pageable);

}