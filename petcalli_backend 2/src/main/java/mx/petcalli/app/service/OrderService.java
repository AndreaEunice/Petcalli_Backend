package mx.petcalli.app.service;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import mx.petcalli.app.model.Order;

public interface OrderService {

    Order createOrder (Order order);
    Order getOrderById (Integer id);
    Order getOrderByAmountProducts (Integer amountProducts);
    Order getOrderByDateTimeOrder(LocalDateTime dateTimeOrder);
    Order getOrderByTotalPrice (BigDecimal totalPrice);
    Order getOrderByPaymentMethod (String paymentMethod);
    Iterable<Order> getAllOrders( );

    //Page<Order> getAllOrders();
    Order updateOrder(Order order, Integer id);
    void deleteOrder(Integer id);

}
