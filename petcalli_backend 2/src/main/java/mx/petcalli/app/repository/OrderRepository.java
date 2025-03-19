package mx.petcalli.app.repository;


import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import mx.petcalli.app.model.Order;

public interface OrderRepository extends CrudRepository <Order, Integer> {

Optional<Order> findByAmountProducts(Integer amountProducts);
Optional<Order>findByDateTimeOrder(LocalDateTime dateTimeOrder);
Iterable<Order>findByTotalPrice(Double totalPrice);
Iterable<Order>findByPaymentMethod(String paymentMethod);

// Page<Order> findAllByActiveTrue(Pageable pageable);
// Page<Order> findAllByActiveFalse(Pageable pageable);
}
