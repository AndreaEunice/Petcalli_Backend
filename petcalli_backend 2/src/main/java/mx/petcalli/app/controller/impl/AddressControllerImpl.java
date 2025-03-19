package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.AddressController;
import mx.petcalli.app.model.Address;
import mx.petcalli.app.service.AddressService;

@CrossOrigin(origins = "*")
// APIREST para las solicitudes http 
@RequestMapping("api/v1/address")
@RestController 
public class AddressControllerImpl implements AddressController{

	private final AddressService addressService; 
	
	//Constructor 
	public AddressControllerImpl(AddressService addressService) {
		this.addressService = addressService; 
	}
		
	@Override
	@GetMapping("{id}")
	public ResponseEntity<Address> getAddressById(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(addressService.getAddressById(id));
	}	

	@Override
	@GetMapping
	public ResponseEntity<Iterable<Address>> getAllAddresses() {
		return ResponseEntity.ok(addressService.getAllAddress());
	}

	@Override
	@PostMapping
	public ResponseEntity<Address> createAddress(@RequestBody Address newAddress) {
		return ResponseEntity.status(201).body(addressService.createAddress(newAddress));
	}
	

	@Override
	@PutMapping("{id}")
	public ResponseEntity<Address> updateAddress(Address address, Integer id) {
		return ResponseEntity.ok(addressService.updateAddress(address, id));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteAddress(@PathVariable("id") Integer id) {
		addressService.deleteAddress(id);
		return ResponseEntity.noContent().build();
	}

}
