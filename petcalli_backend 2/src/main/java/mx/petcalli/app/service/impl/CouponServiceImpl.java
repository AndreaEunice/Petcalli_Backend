package mx.petcalli.app.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Coupon;
import mx.petcalli.app.repository.CouponRepository;
import mx.petcalli.app.service.CouponService;

@Service
public class CouponServiceImpl implements CouponService {
	
	private final CouponRepository couponRepository;
	
	public CouponServiceImpl(CouponRepository couponRepository) {
		this.couponRepository = couponRepository;
	}

	@Override
	public Coupon createCoupon(Coupon coupon) {
		// Guarda nuevo cupon en la base de datos
		return couponRepository.save(coupon);
	}

	@Override
	public Coupon getCouponById(Integer id) {
		// Busca cupon por su ID
		return couponRepository.findById(id).orElse(null);
	}

	@Override
	public Coupon getCouponByStartValidDate(LocalDate startValidDate) {
		// Buscar cupon por su fecha de inicio
		return couponRepository.findByStartValidDate(startValidDate).iterator().next();
	}

	@Override
	public Coupon getCouponByEndValidDate(LocalDate endValidDate) {
		  // Busca cupon por su fecha de finalizacion de validez
        return couponRepository.findByEndValidDate(endValidDate).orElse(null);
	}

	@Override
	public Coupon getCouponByCode(String code) {
		// Buscarlo por codigo
		return couponRepository.findByCode(code).iterator().next();
	}

	@Override
	public Coupon getCouponByPurchaseList(Double purchaseList) {
		// Busca cupon por su limite de compra
        return couponRepository.findByPurchaseLimit(purchaseList).orElse(null);
	}

	@Override
	public Coupon getCouponByDiscount(Double discount) {
		// Buscar por su descuento
		return couponRepository.findByDiscount(discount).iterator().next();
	}

	@Override
	public Iterable<Coupon> getAllCoupon() {
		// Todos los cupones
		return couponRepository.findAll();
	}

	@Override
	public Coupon addCoupon(Integer id) {
		// Si ya existe el cupon con el id y se necesita actualizar
        return couponRepository.findById(id).map(coupon -> {
            coupon.setId(id); // Si el cupon ya existe, solo se actualiza
            return couponRepository.save(coupon); // Guarda el cupon actualizado
        }).orElseThrow(() -> new RuntimeException("Coupon not found"));
	}

	@Override
	public Coupon updateCoupon(Coupon coupon, Integer id) {
		   return couponRepository.findById(id).map(existingCoupon -> {
	            existingCoupon.setStartValidDate(coupon.getStartValidDate());
	            existingCoupon.setEndValidDate(coupon.getEndValidDate());
	            existingCoupon.setCode(coupon.getCode());
	            existingCoupon.setPurchaseLimit(coupon.getPurchaseLimit());
	            existingCoupon.setDiscount(coupon.getDiscount());
	            return couponRepository.save(existingCoupon); // Guarda el cupon actualizado
	        }).orElseThrow(() -> new RuntimeException("Coupon not found"));
	 
	}

	@Override
	public void deleteCoupon(Integer id) {
		couponRepository.deleteById(id);
		
	}
}
	