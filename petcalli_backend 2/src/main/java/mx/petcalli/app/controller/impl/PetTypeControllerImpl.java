package mx.petcalli.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.controller.PetTypeController;
import mx.petcalli.app.model.PetType;

public class PetTypeControllerImpl implements PetTypeController{
	
	

	@Override
	public ResponseEntity<PetType> getPetTypeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<PetType> getByPetType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Set<PetType>> getAllPetTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<PetType> createProduct(PetType newPetType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<PetType> updateProduct(PetType petType, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
