package mx.petcalli.app.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.Role;


public interface RoleRepository  extends CrudRepository<Role, Integer>, PagingAndSortingRepository<Role, Integer>{
	Iterable<Role> findByRole(String role);
	Iterable<Role> findByDescription(String description );
	
	

}

