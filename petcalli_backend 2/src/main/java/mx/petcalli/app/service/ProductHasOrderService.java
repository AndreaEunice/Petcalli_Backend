package mx.petcalli.app.service;

import mx.petcalli.app.model.ProductHasOrder;

public interface ProductHasOrderService {

	ProductHasOrder createProductHasOrder(ProductHasOrder productHasOrder);
	
	Iterable<ProductHasOrder> getProductHasOrder(); 
	ProductHasOrder getProductHasOrderById(int productId, int orderId); 
	Iterable<ProductHasOrder> getProductHasOrderByOrderId(int orderId); 
	Iterable<ProductHasOrder> getAllProductHasOrder();
	ProductHasOrder updateProductHasOrderById(ProductHasOrder productHasOrder, int productId, int orderId);
	void deleteProductHasOrderById(int productId, int orderId);

	
}
