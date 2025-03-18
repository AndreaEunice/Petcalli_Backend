package mx.petcalli.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import mx.petcalli.app.model.Address;


public interface AddressRepository extends CrudRepository<Address, Integer>, PagingAndSortingRepository<Address, Integer> {

	Optional<Address> findByStreet(String street);
	Optional<Address> findByCity(String city);
	Optional<Address> findByState(String state);
	Optional<Address> findByZip(Integer zip);
	Optional<Address> findByCountry(String country);
	
}
