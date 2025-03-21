package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.ProductHasOrderController;
import mx.petcalli.app.model.Address;
import mx.petcalli.app.model.ProductHasOrder;
import mx.petcalli.app.service.ProductHasOrderService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/productHasOrder")
@RestController 
public class ProductHasOrderControllerImpl implements ProductHasOrderController{

	
	private final ProductHasOrderService productHasOrderService;

	public ProductHasOrderControllerImpl(ProductHasOrderService productHasOrderService) {
		this.productHasOrderService = productHasOrderService;
	}
	
	@Override
	@PostMapping
	public ResponseEntity<ProductHasOrder> createProductHasOrder(@RequestBody ProductHasOrder newproductHasOrder) {
		return ResponseEntity.status(201).body(productHasOrderService.createProductHasOrder(newproductHasOrder));
	}

	@Override
	public ResponseEntity<Iterable<ProductHasOrder>> getAllProductHasOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ProductHasOrder> getProductHasOrderByCompositeId(Long productId, Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Iterable<ProductHasOrder>> getProductHasOrderByOrderId(Integer orderId) {
		return ResponseEntity.ok(productHasOrderService.getProductHasOrderByOrderId(orderId));
	}

	@Override
	public ResponseEntity<ProductHasOrder> updateProductHasOrder(ProductHasOrder productHasOrder, Integer productId,Integer orderId) {
		return ResponseEntity.ok(productHasOrderService.updateProductHasOrder(productHasOrder, productId));
	}

	@Override
	@DeleteMapping("/api/v1/producthasorder") 	public ResponseEntity<Void> deleteProductHasOrderByOrderId(
	@RequestParam(name = "productId") int productId,
			@RequestParam(name = "orderId") int orderId
			) { 
		productHasOrderService
		.deleteProductHasOrdertByOrderId(orderId, productId);
		return ResponseEntity.noContent().build();
	}

}
	
	
	
	
	
	
}
