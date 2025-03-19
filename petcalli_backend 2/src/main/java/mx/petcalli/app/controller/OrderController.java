package mx.petcalli.app.controller;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.model.Order;

public interface OrderController {

    
    ResponseEntity<Order> getOrderById(Long id);

    ResponseEntity<Iterable<Order> > getAllOrders ();

    ResponseEntity<Order> createOrder (Order newOrder);

    ResponseEntity<Order> updateOrder (Order order, Long id);

    ResponseEntity<Void> deleteOrder (Long id);

}
