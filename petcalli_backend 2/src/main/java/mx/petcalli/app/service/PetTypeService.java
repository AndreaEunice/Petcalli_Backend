package mx.petcalli.app.service;

import java.util.Set;

import mx.petcalli.app.model.PetType;

public interface PetTypeService {
	PetType createPetType(PetType petType);
	PetType getPetTypeById(int id);
	PetType updatePetType(PetType petType, int id);
	Set<PetType> getAllPetTypes();
	void deletePetType(int id);
	
}
