package mx.petcalli.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import mx.petcalli.app.model.ProductCategory;
import mx.petcalli.app.repository.ProductCategoryRepository;

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
