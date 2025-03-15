package mx.petcalli.app.service;

import mx.petcalli.app.model.PetType;

public interface PetTypeService {
	PetType createPetType(PetType petType);
	PetType getPetTypeById(int id);
	
}
