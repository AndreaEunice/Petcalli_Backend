package mx.petcalli.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.User;

public interface UserRepository extends CrudRepository<User, Integer>, PagingAndSortingRepository<User, Integer> {
	
	Iterable<User> findByName(String name);
	Iterable<User> findByLastName(String lastName);
	Optional<User> findByEmail(String email);
	Iterable<User> findByTelephone(String telephone);
	Iterable<User> findByPassword(String password);

	

}
