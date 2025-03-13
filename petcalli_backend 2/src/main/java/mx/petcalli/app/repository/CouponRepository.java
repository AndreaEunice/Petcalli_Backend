package mx.petcalli.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.Coupon;

public interface CouponRepository extends CrudRepository<Coupon, Integer>, PagingAndSortingRepository<Coupon, Integer> {

}
