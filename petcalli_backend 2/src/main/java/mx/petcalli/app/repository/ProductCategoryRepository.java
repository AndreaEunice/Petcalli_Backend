package mx.petcalli.app.repository;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.Order;
import mx.petcalli.app.model.ProductCategory;

public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer>, PagingAndSortingRepository<ProductCategory, Integer> {
	Optional<ProductCategory> findByname(String name);
	
	//Page<Order> findAllByActiveTrue(Pageable pageable);
	//Page<Order> findAllByActiveFalse(Pageable pageable);
}
