package mx.petcalli.app.util;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import mx.petcalli.app.model.Coupon;
import mx.petcalli.app.repository.CouponRepository;

@Component
@Order(3)
//@Profile("loaderH2")
public class CouponDataLoader implements CommandLineRunner {
	@Autowired
	CouponRepository couponRepository;
	
	@Override
	public void run(String... args) throws Exception {
		couponRepository.save(new Coupon (null, LocalDate.of(2025, 3, 15), LocalDate.of(2025, 3, 15), "SEA2025", 1500.00, 0.25));
		couponRepository.save(new Coupon (null, LocalDate.of(2025, 5, 4), LocalDate.of(2025, 5, 10), "BAR025", 1500.00, 0.25));
		couponRepository.save(new Coupon (null, LocalDate.of(2025, 6, 22), LocalDate.of(2025, 6, 25), "GEO2025", 1500.00, 0.25));
		couponRepository.save(new Coupon (null, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 15), "BAN2025", 1500.00, 0.25));
		couponRepository.save(new Coupon (null, LocalDate.of(2025, 10, 25), LocalDate.of(2025, 10, 30), "HALL2025", 1500.00, 0.25));
		couponRepository.save(new Coupon (null, LocalDate.of(2025, 12, 20), LocalDate.of(2025, 12, 24), "XMAS2025", 1500.00, 0.25));
		
	
	}

}
