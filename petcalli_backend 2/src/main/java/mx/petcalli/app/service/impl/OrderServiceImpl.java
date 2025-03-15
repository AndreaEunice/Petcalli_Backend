package mx.petcalli.app.service.impl;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Order;
import mx.petcalli.app.repository.OrderRepository;
import mx.petcalli.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrderbyId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrderbyAmountProducts(Integer amountProducts) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order getOrderbyDateTimeOrder(LocalDate dateTimeOrder) {
        // TODO Auto-generated method stub
        return null;
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
    public Page<Order> getAllOrders(boolean isActive, int pageNumber, int pageSize) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order updateOrder(Order order, Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteOrder(Long id) {
        // TODO Auto-generated method stub

    }
}
