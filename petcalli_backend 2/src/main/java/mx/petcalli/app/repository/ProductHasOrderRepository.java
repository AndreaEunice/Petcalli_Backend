package mx.petcalli.app.repository;

import org.springframework.data.repository.CrudRepository;

import mx.petcalli.app.model.ProductHasOrder;
import mx.petcalli.app.model.embedded.ProductOrderKey;

public interface ProductHasOrderRepository extends CrudRepository<ProductHasOrder, ProductOrderKey> {

	Iterable<ProductHasOrder> findAllByProductId(Long purchaseId );
	//Iterable<ProductHasOrder> findAllByPurchasePurchaseDate(LocalDateTime purchaseDate );
	void deleteByProductIdAndOrderId(Integer orderId,  Integer productId);
	Iterable<ProductHasOrder> findByOrderId(int orderId);
	
}