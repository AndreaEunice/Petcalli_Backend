package mx.petcalli.app.controller.impl;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.CouponController;
import mx.petcalli.app.model.Coupon;
import mx.petcalli.app.service.CouponService;

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/coupon")
@RestController
public class CouponControllerImpl implements CouponController {

	private final CouponService couponService;
	public CouponControllerImpl(CouponService couponService) {
		this.couponService = couponService;
	}
	
	
	@Override
	@GetMapping("{id}")
	public ResponseEntity<Coupon> getCouponByIdUsynResponEntity(Integer id) {
		return ResponseEntity.ok(couponService.getCouponById(id));
	}

	@Override
	@GetMapping
	public ResponseEntity<Iterable<Coupon>> getAllCoupon() {
		return ResponseEntity.ok(couponService.getAllCoupon());
	}

	@Override
	@PostMapping
	public ResponseEntity<Coupon> createCoupon(Coupon newCoupon) {
		return ResponseEntity.status(201).body(couponService.createCoupon(newCoupon));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteCoupon(@PathVariable("id") Integer id) {
		couponService.deleteCoupon(id);
		return ResponseEntity.noContent().build();
	}
	

	
	
}
