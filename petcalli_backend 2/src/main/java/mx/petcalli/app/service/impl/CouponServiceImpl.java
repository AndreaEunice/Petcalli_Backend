package mx.petcalli.app.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Coupon;
import mx.petcalli.app.repository.CouponRepository;
import mx.petcalli.app.service.CouponService;

@Service
public class CouponServiceImpl implements CouponService {
	
	private CouponRepository couponRepository;

	public CouponServiceImpl(CouponRepository couponRepository) {
		this.couponRepository = couponRepository;
	}

	@Override
	public Coupon createCoupn(Coupon coupon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon getCouponById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon getCouponByStartValidDate(LocalDate startValidDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon getCouponByEndtValidDate(LocalDate endValidDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon getCouponByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon getCouponByPurchaseList(Double purchaseList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon getCouponByDiscount(Double discount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Coupon> getAllCoupon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon addCoupon(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Coupon updateCoupon(Coupon coupon, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCoupon(Integer id) {
		// TODO Auto-generated method stub
		
	}


}
