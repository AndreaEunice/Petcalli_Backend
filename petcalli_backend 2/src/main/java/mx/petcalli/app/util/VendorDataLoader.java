/*package mx.petcalli.app.util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import mx.petcalli.app.model.Vendor;
import mx.petcalli.app.repository.VendorRepository;

public class VendorDataLoader implements CommandLineRunner {
	
	@Autowired
	VendorRepository vendorRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		vendorRepository.save(new Vendor(1, 2,"Pet Paradise", "RFC123456P", "http://petparadise.com", "The ultimate paradise for pet lovers.", "http://petparadise.com/terms"));
		vendorRepository.save(new Vendor(2, 3,  "Happy Tails", "RFC654321H", "http://happytails.com", "Where every tail wags with joy!", "http://happytails.com/terms"));
		vendorRepository.save(new Vendor(3, 4, "Furry Friends", "RFC789123F", "http://furryfriends.com", "Your pet\'s best friend in town.", "http://furryfriends.com/terms"));
		vendorRepository.save(new Vendor(4, 5, "Paws & Claws", "RFC321987C", "http://pawsandclaws.com", "Everything your pet needs under one roof.", "http://pawsandclaws.com/terms"));
		vendorRepository.save(new Vendor(5, 6, "The Pet Hub", "RFC456789T", "http://thepethub.com", "Connecting you with top pet essentials.", "http://thepethub.com/terms"));
		
	}
}
*/