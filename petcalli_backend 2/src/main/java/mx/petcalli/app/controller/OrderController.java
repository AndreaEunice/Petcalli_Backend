package mx.petcalli.app.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.model.Order;

public interface OrderController {

    Order getOrderById (Long id);
    ResponseEntity<Order> getOrderByIdUsyngResponseEntity(Long id);

    ResponseEntity<Set<Order> > getAllOrders ();

    ResponseEntity<Order> createOrder (Order newOrder);

    ResponseEntity<Order> updateOrder (Order order, Long id);

    ResponseEntity<Void> deleteOrder (Long id);

}
