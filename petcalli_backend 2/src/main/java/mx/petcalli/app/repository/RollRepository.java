package mx.petcalli.app.repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.Roll;


public interface RollRepository  extends CrudRepository<Roll, Integer>, PagingAndSortingRepository<Roll, Integer>{
	Set<Roll> findByRoll(String roll);
	Set<Roll> findByDescription(String description );
	


}

