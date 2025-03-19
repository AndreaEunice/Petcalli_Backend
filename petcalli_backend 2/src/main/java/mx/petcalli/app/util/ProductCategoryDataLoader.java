package mx.petcalli.app.util;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.ProductCategory;
import mx.petcalli.app.repository.ProductCategoryRepository;

@Component
@Order(4)
//@Profile("devH2")
public class ProductCategoryDataLoader implements CommandLineRunner{

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Override
	public void run(String... args) throws Exception {
		productCategoryRepository.save(new ProductCategory(null, "Accesorios"));
		productCategoryRepository.save(new ProductCategory(null, "Ropa"));
		productCategoryRepository.save(new ProductCategory(null, "Alimentos"));
		productCategoryRepository.save(new ProductCategory(null, "Juguetes"));
		productCategoryRepository.save(new ProductCategory(null, "Medicamentos"));
		
	}
	
	
	
}
