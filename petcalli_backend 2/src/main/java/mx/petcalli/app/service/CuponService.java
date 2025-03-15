package mx.petcalli.app.service;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.data.domain.Page;

import mx.petcalli.app.model.Coupon;

public interface CuponService {
	Coupon createCoupn (Coupon coupon);
	
	Coupon getCouponById(Integer id);
	Coupon getCouponByStartValidDate(LocalDate startValidDate);
	Coupon getCouponByEndtValidDate(LocalDate endValidDate);
	Coupon getCouponByCode(String code);
	Coupon getCouponByPurchaseList(Double purchaseList);
	Coupon getCouponByDiscount(Double discount);
	
	Page<Coupon> getAllCoupons(int pageNumber, int pageSize);
	
	Set<Coupon> getAllCoupons(Integer id);
	Set<Coupon> addCoupon(Integer id);
	Set<Coupon> updateCoupons(Coupon coupon, Integer id);
	
	void deleteCoupon(Integer id);
	
	// Se obtienen todas las direcciones 
		// SET no permite duplicados
		/*PAGE Se utiliza en aplicaciones web para 
		 * mostrar conjuntos de datos grandes (como resultados de búsqueda) divididos en páginas más manejables.
		 */

}
