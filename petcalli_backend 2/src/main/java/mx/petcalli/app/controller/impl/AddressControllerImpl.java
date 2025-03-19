package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.AddressController;
import mx.petcalli.app.model.Address;

@CrossOrigin(origins = "*")
// Apirest las solicitudes http 
@RequestMapping("/api/v1/address")
@RestController 
public class AddressControllerImpl implements AddressController{

	@Override
	public ResponseEntity<Address> getAddressByIdUsynResponEntity(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Set<Address>> getAllAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Address> createAddress(Address newAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Address> updateAddress(Address address, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deleteAddress(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
