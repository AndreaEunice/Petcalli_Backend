package mx.petcalli.app.service.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import jakarta.persistence.OptimisticLockException;
import mx.petcalli.app.model.PetType;
import mx.petcalli.app.repository.PetTypeRepository;
import mx.petcalli.app.service.PetTypeService;

@Service
public class PetTypeServiceImpl implements PetTypeService {

	private final PetTypeRepository petTypeRepository;
	
	PetTypeServiceImpl(PetTypeRepository petTypeRepository){
		this.petTypeRepository = petTypeRepository;
	}
	@Override
	public PetType createPetType(PetType petType) {
		Optional<PetType> optionalPetType = petTypeRepository.findById(petType.getId());
		if(optionalPetType.isPresent()) {
			throw new OptimisticLockException("Ya existe esta categoria");
		}
		petType.setId(null);
		PetType nuevaPetType = petTypeRepository.save(petType);
		return nuevaPetType;
	}

	@Override
	public PetType getPetTypeById(int id) {
		Optional<PetType> optionalPetType = petTypeRepository.findById(id);
		if(optionalPetType.isEmpty()) {
			throw new IllegalStateException("PetType doesnt exist with this id");
			
		}
		PetType existingPetType = optionalPetType.get();
		return existingPetType;
	}

	@Override
	public PetType updatePetType(PetType petType, int id) {
		PetType existingPetType = getPetTypeById(id);
		existingPetType.setPetType(petType.getPetType());
		existingPetType.setDescription(petType.getDescription());
		
		return petTypeRepository.save(existingPetType);
		
	}

	@Override
	public Set<PetType> getAllPetTypes() {
		Iterable<PetType> petTypesIterable = petTypeRepository.findAll();
		return new LinkedHashSet<>((Collection<PetType>)petTypesIterable);
	}

	@Override
	public void deletePetType(int id) {
		
	}
	
}	
