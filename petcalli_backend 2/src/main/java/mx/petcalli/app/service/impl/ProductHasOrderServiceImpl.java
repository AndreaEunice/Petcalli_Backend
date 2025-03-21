package mx.petcalli.app.service.impl;

import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Order;
import mx.petcalli.app.model.ProductHasOrder;
import mx.petcalli.app.model.embedded.ProductOrderKey;
import mx.petcalli.app.repository.ProductHasOrderRepository;
import mx.petcalli.app.service.OrderService;
import mx.petcalli.app.service.ProductHasOrderService;

@Service
public class ProductHasOrderServiceImpl implements ProductHasOrderService{

	ProductHasOrderRepository productHasOrderRepository;
	
	OrderService orderService;

	
	
	public ProductHasOrderServiceImpl(ProductHasOrderRepository productHasOrderRepository, OrderService orderService) {
		super();
		this.productHasOrderRepository = productHasOrderRepository;
		this.orderService = orderService;
	}

	@Override
	public ProductHasOrder createProductHasOrder (ProductHasOrder productHasOrder) {
		
		ProductOrderKey orderKey = new ProductOrderKey();
		orderKey.setProduct_id(productHasOrder.getProduct().getId());
		
		orderKey.setOrder_id( productHasOrder.getOrder().getId() );
		productHasOrder.setId( orderKey );
		
		return productHasOrderRepository.save(productHasOrder);	
	}
	
	//pendiente
	private Order getOrderOfProduct( Integer id ) {
		return orderService.getOrderById( id );
	}

	@Override
	public Iterable<ProductHasOrder> getProductHasOrder() {
	    return productHasOrderRepository.findAll();
	}


	@Override
	public ProductHasOrder getProductHasOrderById(int productId, int orderId) {
	    return productHasOrderRepository.findById(new ProductOrderKey(productId, orderId))
	            .orElseThrow(() -> new IllegalStateException("ProductHasOrder no encontrado."));
	}


	@Override
	public Iterable<ProductHasOrder> getProductHasOrderByOrderId(int orderId) {
	    return productHasOrderRepository.findByOrderId(orderId);
	}

	@Override
	public ProductHasOrder updateProductHasOrderById(ProductHasOrder productHasOrder, int productId, int orderId) {
	    ProductHasOrder existing = getProductHasOrderById(productId, orderId);
	    return productHasOrderRepository.save(existing);
	}


	@Override
	public void deleteProductHasOrderById(int productId, int orderId) {
	    productHasOrderRepository.deleteById(new ProductOrderKey(productId, orderId));
	}

	@Override
	public Iterable<ProductHasOrder> getAllProductHasOrder() {
		return productHasOrderRepository.findAll();
	} 	
	
}
