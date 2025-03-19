package mx.petcalli.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Address;
import mx.petcalli.app.repository.AddressRepository;
import mx.petcalli.app.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{
	
	// Estamos conectando la base de datos con Service, creo. 
	private final AddressRepository addressRepository; 

	// Crear el constructor de AddressRepositoryImpl	
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository; 
	}

	@Override
	public Address createAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressByStreet(String street) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressByZip(Integer zip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressByCountry(String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address updateAddress(Address address, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAddress(Integer id) {
		// TODO Auto-generated method stub
		
	}

		

}
