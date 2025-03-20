package mx.petcalli.app.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;


import mx.petcalli.app.model.PetType;

public interface PetTypeController {
	ResponseEntity<PetType> getPetTypeId(int id);
	ResponseEntity<PetType> getByPetType();
	
	ResponseEntity< Set<PetType> > getAllPetTypes();
	ResponseEntity<PetType> createPetType(PetType newPetType);
	ResponseEntity<PetType> updatePetType(PetType petType, int id);
	ResponseEntity<Void> deletePetType(int id);
	
}
