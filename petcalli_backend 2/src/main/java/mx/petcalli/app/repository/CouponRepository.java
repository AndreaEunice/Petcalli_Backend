package mx.petcalli.app.repository;

import java.time.LocalDate;
import java.util.Set;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import mx.petcalli.app.model.Coupon;


public interface CouponRepository extends CrudRepository<Coupon, Integer>, PagingAndSortingRepository<Coupon, Integer> {

	Set<Coupon> findByStartValidDate(LocalDate startValidDate);
	Set<Coupon> findByEndValidDate(LocalDate endValidDate);
	Set<Coupon> findByCode(Double code);
	Set<Coupon> findByPurchaseLimit(Double purchaseLimit);
	Set<Coupon> findByDiscount(Double dicount);


	Page<Coupon> findAllByActiveTrue(Pageable pageable);
	Page<Coupon> findAllByActiveFalse(Pageable pageable);
	
}
