package mx.petcalli.app.service.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PetType getPetTypeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PetType updatePetType(PetType petType, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<PetType> getAllPetTypes() {
		// TODO Auto-generated method stub
		Iterable<PetType> petTypesIterable = petTypeRepository.findAll();
		return new LinkedHashSet<>((Collection<PetType>)petTypesIterable);
	}

	@Override
	public void deletePetType(int id) {
		// TODO Auto-generated method stub
		
	}
	
}	
