package mx.petcalli.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import mx.petcalli.app.model.Address;
import mx.petcalli.app.repository.AddressRepository;

public class AddressDataLoader implements CommandLineRunner {
	@Autowired
	AddressRepository addressRepository;
	@Override
	public void run(String... args) throws Exception {
		addressRepository.save(new Address(1, 1, "Calle del Sol 123", "Ciudad de México", "CDMX", 06000, "México"));
		addressRepository.save(new Address(2, 2, "Avenida Revolución 456", "Guadalajara", "Jalisco", 44130, "México"));
		addressRepository.save(new Address(3, 3, "Calle Río Verde", "Monterrey", "Nuevo León", 64000, "México"));
		addressRepository.save(new Address(4, 4, "Boulevard de los Héroes 101", "Puebla", "Puebla", 72000, "México"));
		addressRepository.save(new Address(5, 5, "Callejón de las Flores 55", "Cancún", "Quintana Roo", 77500, "México"));
	}
}

	
