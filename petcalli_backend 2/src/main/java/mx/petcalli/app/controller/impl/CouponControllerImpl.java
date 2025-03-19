package mx.petcalli.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.CouponController;
import mx.petcalli.app.model.Coupon;
import mx.petcalli.app.service.CouponService;

@CrossOrigin(origins = "*")
@RestController
public class CouponControllerImpl implements CouponController {
	

	public CouponControllerImpl(CouponService couponService) {
	}

	@Override
	public ResponseEntity<Coupon> getAddressByIdUsynResponEntity(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Coupon> getAllCoupon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Set<Coupon>> getAllAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Coupon> createCoupon(Coupon newCoupon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deleteCoupon(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
