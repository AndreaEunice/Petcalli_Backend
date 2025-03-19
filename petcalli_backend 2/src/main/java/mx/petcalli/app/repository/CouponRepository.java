package mx.petcalli.app.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import mx.petcalli.app.model.Coupon;


public interface CouponRepository extends CrudRepository<Coupon, Integer> {

	Iterable<Coupon> findByStartValidDate(LocalDate startValidDate);
	Optional<Coupon> findByEndValidDate(LocalDate endValidDate);
	Iterable<Coupon> findByCode(String code);
	Optional<Coupon> findByPurchaseLimit(Double purchaseLimit);
	Iterable<Coupon> findByDiscount(Double dicount);
	
}
