package mx.petcalli.app.repository;



import org.springframework.data.repository.CrudRepository;

import mx.petcalli.app.model.PetType;

public interface PetTypeRepository extends CrudRepository <PetType,Integer> {
	Iterable<PetType> findByid(Integer id);
	Iterable<PetType> findByPetType(String petType);
	Iterable<PetType> findByDescription(String description);
	
}
