package mx.petcalli.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import mx.petcalli.app.repository.AddressRepository;

public class AddressDataLoader implements CommandLineRunner {
	@Autowired
	AddressRepository addressRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Preguntar sobre fk
		 * 
		addressRepository.save(new Address(id, fk-id, "Calle del Sol 123", "Ciudad de México", "CDMX", 06000, "México"));
		addressRepository.save(new Address(id, fk-id, "Avenida Revolución 456", "Guadalajara", "Jalisco", 44130, "México"));
		addressRepository.save(new Address(id, fk-id, "Calle Río Verde", "Monterrey", "Nuevo León", 64000, "México"));
		addressRepository.save(new Address(id, fk-id, "Boulevard de los Héroes 101", "Puebla", "Puebla", 72000, "México"));
		addressRepository.save(new Address(id, fk-id, "Callejón de las Flores 55", "Cancún", "Quintana Roo", 77500, "México"));
		*/
	}
}

	
