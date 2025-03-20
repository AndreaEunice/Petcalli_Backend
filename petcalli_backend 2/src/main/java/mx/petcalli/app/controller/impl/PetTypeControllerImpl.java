package mx.petcalli.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.PetTypeController;
import mx.petcalli.app.model.PetType;
import mx.petcalli.app.service.PetTypeService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/pettypes") // localhost:8080/api/v1 
public class PetTypeControllerImpl implements PetTypeController{
	
	/*Inyección de dependencias del Servicio*/
	
	private final PetTypeService petTypeService;
	
	public PetTypeControllerImpl(PetTypeService petTypeService) {
		this.petTypeService = petTypeService;
	}
	
	/*Inician los endpoints*/
	
	@Override
	@GetMapping("{id}")
	public ResponseEntity<PetType> getPetTypeId(@PathVariable("id") int id) {
		PetType petTypeId = petTypeService.getPetTypeById(id);
		return ResponseEntity.ok(petTypeId);
	}
	
	@GetMapping
	@Override
	public ResponseEntity<Set<PetType>> getAllPetTypes() {
		Set<PetType> petTypes = petTypeService.getAllPetTypes();
		return ResponseEntity.ok(petTypes);
	}
	
	
	@Override
	public ResponseEntity<PetType> getByPetType() {
		return null;
	}
	

	@Override
	@PostMapping
	public ResponseEntity<PetType> createPetType(@RequestBody PetType newPetType) {
		PetType nuevaPetType = petTypeService.createPetType(newPetType);
		return ResponseEntity.status(201).body(nuevaPetType);
	}

	@Override
	@PutMapping("{id}")
	public ResponseEntity<PetType> updatePetType(@RequestBody PetType petType, @PathVariable("id") int id) {
		PetType actualizarPetType = petTypeService.updatePetType(petType, id);
		return ResponseEntity.status(200).body(actualizarPetType);
	}

	@Override
	public ResponseEntity<Void> deletePetType(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
