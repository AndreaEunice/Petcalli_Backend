package mx.petcalli.app.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Order;
import mx.petcalli.app.repository.OrderRepository;
import mx.petcalli.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        order.setId(null);
        return orderRepository.save(order);
    }


    public Order getOrderbyId(Long id) {
        return orderRepository.findById(id)
        .orElseThrow( ()-> new IllegalStateException("Order does not exist with id: "+ id) );
    }

    @Override
    public Order getOrderbyAmountProducts(Integer amountProducts) {
        return orderRepository.findByAmountProducts(amountProducts)
        .orElseThrow(() -> new IllegalStateException("Order does not exist with amountProducts: " + amountProducts));
    }

    
    public Order getOrderbyDateTimeOrder(LocalDateTime dateTimeOrder) {
        return orderRepository.findByDateTimeOrder(dateTimeOrder)
                .orElseThrow(() -> new IllegalStateException("Order does not exist with dateTimeOrder: " + dateTimeOrder));
    }

    @Override
    public Order getOrderbyTotalPrice(Double totalPrice) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrderbyPaymentMethod(String paymentMethod) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
	public Iterable<Order> getAllOrders() {
		return orderRepository.findAll();
	}

    @Override
    public Order updateOrder(Order order, Long id) {
        Order existingOrder = getOrderbyId(id);
        existingOrder.setAmountProducts(order.getAmountProducts());
        existingOrder.setTotalPrice(order.getTotalPrice());
        existingOrder.setPaymentMethod(order.getPaymentMethod());
        existingOrder.setDateTimeOrder(order.getDateTimeOrder());
        return orderRepository.save(existingOrder);
    }

    @Override
    public void deleteOrder(Long id) {
        Order existingOrder = getOrderbyId(id);
        orderRepository.delete(existingOrder);

    }

    @Override
    public Order getOrderById(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Order getOrderbyDateTimeOrder(LocalDate dateTimeOrder) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
