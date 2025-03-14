package mx.petcalli.app.repository;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.Order;

public interface OrderRepository extends CrudRepository <Order, Long>, PagingAndSortingRepository<Order, Long> {

Set<Order> findByAmountProducts(Integer amountProducts);
Set<Order>findByDateTimeOrder(LocalDate dateTimeOrders);
Set<Order>findByTotalPrice(Double totalPrice);
Set<Order>findByPaymentMethod(String paymentMethod);

Page<Order> findAllByActiveTrue(Pageable pageable);
Page<Order> findAllByActiveFalse(Pageable pageable);
}
