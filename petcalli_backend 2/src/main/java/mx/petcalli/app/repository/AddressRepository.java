package mx.petcalli.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import mx.petcalli.app.model.Address;


public interface AddressRepository extends CrudRepository<Address, Integer>, PagingAndSortingRepository<Address, Integer> {

}
