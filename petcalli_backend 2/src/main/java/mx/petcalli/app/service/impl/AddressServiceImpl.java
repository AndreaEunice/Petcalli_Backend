package mx.petcalli.app.service.impl;

import java.util.Optional;
import mx.petcalli.app.model.Address;
import mx.petcalli.app.repository.AddressRepository;
import mx.petcalli.app.service.AddressService;

public class AddressServiceImpl implements AddressService{
	
	// Estamos conectando la base de datos con Service, creo. 
	private final AddressRepository addressRepository; 

	// Crear el constructor de AddressRepositoryImpl	
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository; 
	}
	
	
	@Override
	public Address createAddress(Address address) {
		if (address == null || address.getStreet() == null || address.getStreet().trim().isEmpty()) {
	        throw new IllegalArgumentException("Address or required fields cannot be null or empty");
	    }
	    Address savedAddress = addressRepository.save(address);
	    return savedAddress;
	}

	@Override
	public Address getAddressById(Integer id) {
		 Optional<Address> optionalAddress = addressRepository.findById(id);
		    if (optionalAddress.isEmpty()) {
		        throw new IllegalStateException("Address not found with ID: " + id);
		    }
		    return optionalAddress.get();
	}

	@Override
	public Address getAddressByStreet(String street) {
		if (street == null || street.trim().isEmpty()) {
	        throw new IllegalArgumentException("Street cannot be null or empty");
	    }

	    Optional<Address> optionalAddress = addressRepository.findByStreet(street);
	    if (optionalAddress.isEmpty()) {
	        throw new IllegalArgumentException("Address not found with street: " + street);
	    }
	    return optionalAddress.get();
	}


	@Override
	public Address getAddressByCity(String city) {
		if (city == null || city.trim().isEmpty()) {
	        throw new IllegalArgumentException("City cannot be null or empty");
	    }

	    Optional<Address> optionalAddress = addressRepository.findByCity(city);
	    if (optionalAddress.isEmpty()) {
	        throw new IllegalArgumentException("Address not found with city: " + city);
	    }
	    return optionalAddress.get();
	}

	@Override
	public Address getAddressByState(String state) {
		if (state == null || state.trim().isEmpty()) {
	        throw new IllegalArgumentException("State cannot be null or empty");
	    }

	    Optional<Address> optionalAddress = addressRepository.findByState(state);
	    if (optionalAddress.isEmpty()) {
	        throw new IllegalArgumentException("Address not found with state: " + state);
	    }
	    return optionalAddress.get();
	}

	@Override
	public Address getAddressByZip(Integer zip) {
		if (zip == null || zip <= 0) {
		    throw new IllegalArgumentException("Zip code must be a positive number");
		}

	    Optional<Address> optionalAddress = addressRepository.findByZip(zip);
	    if (optionalAddress.isEmpty()) {
	        throw new IllegalArgumentException("Address not found with zip: " + zip);
	    }
	    return optionalAddress.get();
	}

	@Override
	public Address getAddressByCountry(String country) {
		if (country == null || country.trim().isEmpty()) {
	        throw new IllegalArgumentException("Country cannot be null or empty");
	    }

	    Optional<Address> optionalAddress = addressRepository.findByCountry(country);
	    if (optionalAddress.isEmpty()) {
	        throw new IllegalArgumentException("Address not found with country: " + country);
	    }
	    return optionalAddress.get();
	}

	@Override
	public Address updateAddress(Address address, Integer id) {
		Optional<Address> optionalAddress = addressRepository.findById(id);
	    if (optionalAddress.isEmpty()) {
	        throw new IllegalStateException("Address not found with ID: " + id);
	    }
	    Address existingAddress = optionalAddress.get();
	    existingAddress.setStreet(address.getStreet());
	    existingAddress.setCity(address.getCity());
	    // Actualiza otros campos según sea necesario
	    return addressRepository.save(existingAddress);
	}

	@Override
	public void deleteAddress(Integer id) {
		if (!addressRepository.existsById(id)) {
	        throw new IllegalStateException("Address not found with ID: " + id);
	    }
	    addressRepository.deleteById(id);
		
	}

}
