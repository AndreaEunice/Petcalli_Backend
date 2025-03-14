package mx.petcalli.app.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import mx.petcalli.app.model.User;

public interface UserRepository extends CrudRepository<User, Integer>, PagingAndSortingRepository<User, Integer> {
	
	Set<User> findByname(String name);
	Set<User> findBylast_name(String last_name);
	Set<User> findByemail(String email);
	Set<User> findBytelephone(String telephone);
	Set<User> findBypassword(String password);

	Page<User> findAllByActiveTrue(Pageable pageable);
	Page<User> findAllByActiveFalse(Pageable pageable);

}
