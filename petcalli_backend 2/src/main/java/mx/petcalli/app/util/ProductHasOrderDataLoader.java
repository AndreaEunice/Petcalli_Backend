package mx.petcalli.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.ProductHasOrder;
import mx.petcalli.app.repository.ProductHasOrderRepository;

@Component
public class ProductHasOrderDataLoader {
	
	@Autowired 
	 ProductHasOrderRepository productHasOrderRepository;
	
	 public void run(String... args) throws Exception {
		 
		 productHasOrderRepository.save(new ProductHasOrder());
	  
	 }
}
