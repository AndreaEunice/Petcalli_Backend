package mx.petcalli.app.repository;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import mx.petcalli.app.model.Address;


public interface AddressRepository extends CrudRepository<Address, Integer>, PagingAndSortingRepository<Address, Integer> {

	Set<Address> findByStreet(String street);
	Set<Address> findByCity(String city);
	Set<Address> findByState(Double state);
	Set<Address> findByZip(Integer zip);
	Set<Address> findByCountry(String country);
	Page<Address> findAllByActiveTrue(Pageable pageable);
	Page<Address> findAllByActiveFalse(Pageable pageable);
	
}
