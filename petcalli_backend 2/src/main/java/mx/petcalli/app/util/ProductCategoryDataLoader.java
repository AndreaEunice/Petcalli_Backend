package mx.petcalli.app.util;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.ProductCategory;
import mx.petcalli.app.repository.ProductCategoryRepository;

@Component
@Order(1)
@Profile("devH2")
public class ProductCategoryDataLoader implements CommandLineRunner{

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Override
	public void run(String... args) throws Exception {
		productCategoryRepository.save(new ProductCategory(1, "Accesorios"));
		productCategoryRepository.save(new ProductCategory(2, "Ropa"));
		productCategoryRepository.save(new ProductCategory(3, "Alimentos"));
		productCategoryRepository.save(new ProductCategory(4, "Juguetes"));
		productCategoryRepository.save(new ProductCategory(5, "Medicamentos"));
		
	}
	
	
	
}
