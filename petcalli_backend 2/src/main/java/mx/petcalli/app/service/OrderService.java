package mx.petcalli.app.service;

import java.time.LocalDate;

import mx.petcalli.app.model.Order;

public interface OrderService {

    Order createOrder (Order order);
    Order getOrderById (Long id);
    Order getOrderbyAmountProducts (Integer amountProducts);
    Order getOrderbyDateTimeOrder(LocalDate dateTimeOrder);
    Order getOrderbyTotalPrice (Double totalPrice);
    Order getOrderbyPaymentMethod (String paymentMethod);
    Iterable<Order> getAllOrders( );

    //Page<Order> getAllOrders();
    Order updateOrder(Order order, Long id);
    void deleteOrder(Long id);

}
