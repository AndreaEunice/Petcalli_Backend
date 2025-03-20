package mx.petcalli.app.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.User;

public interface UserRepository extends CrudRepository<User, Integer>, PagingAndSortingRepository<User, Integer> {
	
	Set<User> findByName(String name);
	Set<User> findByLastName(String lastName);
	Set<User> findByEmail(String email);
	Set<User> findByTelephone(String telephone);
	Set<User> findByPassword(String password);

	

}
