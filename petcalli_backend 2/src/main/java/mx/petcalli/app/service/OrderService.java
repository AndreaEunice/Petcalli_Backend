package mx.petcalli.app.service;

import java.time.LocalDate;

import org.springframework.data.domain.Page;

import mx.petcalli.app.model.Order;

public interface OrderService {
    Order createOrder (Order order);
    Order getOrderbyId (Long id);
    Order getOrderbyAmountProducts (Integer amountProducts);
    Order getOrderbyDateTimeOrder(LocalDate dateTimeOrder);
    Order getOrderbyTotalPrice (Double totalPrice);
    Order getOrderbyPaymentMethod (String paymentMethod);

    Page<Order> getAllOrders(boolean isActive, int pageNumber, int pageSize);
    Order updateOrder(Order order, Long id);
    void deleteOrder(Long id);

}
