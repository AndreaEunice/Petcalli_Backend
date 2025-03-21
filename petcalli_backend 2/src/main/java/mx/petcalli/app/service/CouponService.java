package mx.petcalli.app.service;

import java.time.LocalDate;
import mx.petcalli.app.model.Coupon;

public interface CouponService {
	
	Coupon createCoupon (Coupon coupon);
	Coupon getCouponById(Integer id);
	Coupon getCouponByStartValidDate(LocalDate startValidDate);
	Coupon getCouponByEndValidDate(LocalDate endValidDate);
	Coupon getCouponByCode(String code);
	Coupon getCouponByPurchaseList(Double purchaseList);
	Coupon getCouponByDiscount(Double discount);
	
	Iterable<Coupon> getAllCoupon();
	Coupon addCoupon(Integer id);
	Coupon updateCoupon(Coupon coupon, Integer id);
	void deleteCoupon(Integer id);
	
}
