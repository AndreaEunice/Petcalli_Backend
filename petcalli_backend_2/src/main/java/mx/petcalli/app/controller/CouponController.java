package mx.petcalli.app.controller;

import org.springframework.http.ResponseEntity;
import mx.petcalli.app.model.Coupon;

public interface CouponController {

	// Controlar la respuesta a 200, 201, 404
		ResponseEntity<Coupon> getCouponByIdUsynResponEntity(Integer id);
		
		//Obtener todos los cupones 
		ResponseEntity< Iterable <Coupon> > getAllCoupon();
	
		
		//Crear nuevos cupones
		ResponseEntity <Coupon> createCoupon(Coupon newCoupon);
		
		
		//Eliminar un cupon (Void para decir que es un elemento vacio sin respuesta)
		ResponseEntity <Void> deleteCoupon(Integer id);
}
