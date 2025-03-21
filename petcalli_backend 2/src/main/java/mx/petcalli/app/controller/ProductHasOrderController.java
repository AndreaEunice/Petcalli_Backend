package mx.petcalli.app.controller;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.model.ProductHasOrder;

public interface ProductHasOrderController {
	ResponseEntity<ProductHasOrder> createProductHasOrder(ProductHasOrder productHasOrder);
	ResponseEntity< Iterable<ProductHasOrder>> getAllProductHasOrder();
	ResponseEntity< ProductHasOrder> getProductHasOrderByCompositeId(Integer productId, Integer orderId);
	ResponseEntity< Iterable<ProductHasOrder>> getProductHasOrderByOrderId(Integer orderId);
	ResponseEntity<ProductHasOrder> updateProductHasOrder(ProductHasOrder productHasOrder, Integer productId, Integer orderId);
	ResponseEntity< Void > deleteProductHasOrderByCompositeId(Integer orderId, Integer productId);
}
