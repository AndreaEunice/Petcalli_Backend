package main.java.mx.petcalli.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.VendorController;
import mx.petcalli.app.model.Vendor;
import mx.petcalli.app.service.VendorService;

@RestController
public class VendorControllerImpl implements VendorController{
	
	private final VendorService vendorService;
	
	public VendorControllerImpl(VendorService vendorService) {
		this.vendorService = vendorService;
	}
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
	
	@GetMapping("api/v1/petTypes")
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
