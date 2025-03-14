package mx.petcalli.app.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import mx.petcalli.app.repository.VendorRepositoryRepository;

public class VendorDataLoader implements CommandLineRunner {
	@Autowired
	VendorRepository vendorRepository;
	@Override
	public void run(String... args) throws Exception {
		
        
		vendorRepositoryRepository.save(new Vendor(id, fkId,"Pet Paradise", "RFC123456P", "http://petparadise.com", "The ultimate paradise for pet lovers.", "http://petparadise.com/terms"));
		vendorRepository.save(new Vendor(id, fkId,  "Happy Tails", "RFC654321H", "http://happytails.com", "Where every tail wags with joy!", "http://happytails.com/terms"));
		vendorRepository.save(new Vendor(id, fkId, "Furry Friends", "RFC789123F", "http://furryfriends.com", "Your pet\'s best friend in town.", "http://furryfriends.com/terms"));
		vendorRepository.save(new Vendor(id, fkId, "Paws & Claws", "RFC321987C", "http://pawsandclaws.com", "Everything your pet needs under one roof.", "http://pawsandclaws.com/terms"));
		vendorRepository.save(new Vendor(id, fkId, "The Pet Hub", "RFC456789T", "http://thepethub.com", "Connecting you with top pet essentials.", "http://thepethub.com/terms"));
		
	}
}
