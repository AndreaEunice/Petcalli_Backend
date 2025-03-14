package mx.petcalli.app.repository;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.PetType;

public interface PetTypeRepository extends CrudRepository <PetType,Integer> , PagingAndSortingRepository<PetType,Integer> {
	Set<PetType> findByid(Integer id);
	Set<PetType> findByPetType(String petType);
	Set<PetType> findByDescription(String description);
	

	Page<PetType> findAllByActiveTrue(Pageable pageable);
	Page<PetType> findAllByActiveFalse(Pageable pageable);
}
