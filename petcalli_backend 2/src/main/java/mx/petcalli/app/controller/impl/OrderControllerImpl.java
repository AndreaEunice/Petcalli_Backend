package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.OrderController;
import mx.petcalli.app.model.Order;
import mx.petcalli.app.service.OrderService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/orders")
@RestController
public class OrderControllerImpl implements OrderController {

    private final OrderService orderService;

    public OrderControllerImpl(OrderService orderService) {
        this.orderService = orderService;

    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(orderService.getOrderById( id )) ;
    }

    @Override
    @GetMapping
    public ResponseEntity<Iterable<Order>> getAllOrders() {
        return ResponseEntity.ok( orderService.getAllOrders() );
    }

    @Override
    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return ResponseEntity.status(201).body(orderService.createOrder(order));
    }

	@Override
	@PutMapping("{id}")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order,@PathVariable("id") Integer id) {
		return ResponseEntity.ok( orderService.updateOrder(order, id) );
	}

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteOrder(Integer id) {
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }

}
