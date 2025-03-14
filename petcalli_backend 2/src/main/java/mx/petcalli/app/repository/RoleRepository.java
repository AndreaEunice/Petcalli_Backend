package mx.petcalli.app.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.Role;


public interface RoleRepository  extends CrudRepository<Role, Integer>, PagingAndSortingRepository<Role, Integer>{
	Set<Role> findByRoll(String role);
	Set<Role> findByDescription(String description );
	
	

}

