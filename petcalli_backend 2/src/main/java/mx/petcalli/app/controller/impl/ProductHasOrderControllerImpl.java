package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.ProductHasOrderController;
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
	@GetMapping
	public ResponseEntity<Iterable<ProductHasOrder>> getAllProductHasOrder() {
		Iterable<ProductHasOrder> productHasOrders = productHasOrderService.getProductHasOrder();
		return ResponseEntity.ok(productHasOrders);
	}

	@Override
	@GetMapping("/query")
	public ResponseEntity<ProductHasOrder> getProductHasOrderByCompositeId(@RequestParam(name = "productId") Integer productId,
			@RequestParam(name = "orderId") Integer orderId) {
		ProductHasOrder productsHasOrders = productHasOrderService.getProductHasOrderById(productId, orderId);
		return ResponseEntity.ok(productsHasOrders);
	} 

	@Override
	public ResponseEntity<Iterable<ProductHasOrder>> getProductHasOrderByOrderId(Integer orderId) {
		return ResponseEntity.ok(productHasOrderService.getProductHasOrderByOrderId(orderId));
	}

	@PutMapping("/{productId}/{orderId}")
	public ResponseEntity<ProductHasOrder> updateProductHasOrder(
	        @RequestBody ProductHasOrder productHasOrder,
	        @PathVariable(name = "productId") Integer productId,
	        @PathVariable(name = "orderId") Integer orderId) {
	    return ResponseEntity.ok(productHasOrderService.updateProductHasOrderById(productHasOrder, productId, orderId));
	}


	
	@DeleteMapping("/{productId}/{orderId}")
	public ResponseEntity<Void> deleteProductHasOrderByCompositeId(
	    @PathVariable("productId") Integer productId,
	    @PathVariable("orderId") Integer orderId) {
	    productHasOrderService.deleteProductHasOrderById(orderId, productId);
	    return ResponseEntity.noContent().build();
	}




}