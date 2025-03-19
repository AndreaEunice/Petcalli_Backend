package mx.petcalli.app.service.impl;

import java.math.BigDecimal;
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


    @Override
    public Order getOrderById(Integer id) {
        return orderRepository.findById(id)
        .orElseThrow( ()-> new IllegalStateException("Order does not exist with id: "+ id) );
    }

    @Override
    public Order getOrderByAmountProducts(Integer amountProducts) {
        return orderRepository.findByAmountProducts(amountProducts)
        .orElseThrow(() -> new IllegalStateException("Order does not exist with amountProducts: " + amountProducts));
    }

    @Override
    public Order getOrderByDateTimeOrder(LocalDateTime dateTimeOrder) {
        return orderRepository.findByDateTimeOrder(dateTimeOrder)
                .orElseThrow(() -> new IllegalStateException("Order does not exist with dateTimeOrder: " + dateTimeOrder));
    }

    @Override
    public Order getOrderByTotalPrice(BigDecimal totalPrice) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrderByPaymentMethod(String paymentMethod) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
	public Iterable<Order> getAllOrders() {
		return orderRepository.findAll();
	}

    @Override
    public Order updateOrder(Order order, Integer id) {
        Order existingOrder = getOrderById(id);
        existingOrder.setAmountProducts(order.getAmountProducts());
        existingOrder.setTotalPrice(order.getTotalPrice());
        existingOrder.setPaymentMethod(order.getPaymentMethod());
        existingOrder.setDateTimeOrder(order.getDateTimeOrder());
        return orderRepository.save(existingOrder);
    }

    @Override
    public void deleteOrder(Integer id) {
        Order existingOrder = getOrderById(id);
        orderRepository.delete(existingOrder);
    }
}

