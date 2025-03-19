package mx.petcalli.app.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.model.Coupon;

public interface CouponController {

	// Controlar la respuesta a 200, 201, 404
		ResponseEntity<Coupon> getAddressByIdUsynResponEntity(Integer id);
		
		//Obtener todos los cupones 
		Set<Coupon> getAllCoupon();
		ResponseEntity< Set <Coupon> > getAllAddresses();
		
		//Crear nuevos cupones
		ResponseEntity <Coupon> createCoupon(Coupon newCoupon);
		
		
		//Eliminar un cupon (Void para decir que es un elemento vacio sin respuesta)
		ResponseEntity <Void> deleteCoupon(Integer id);
}
