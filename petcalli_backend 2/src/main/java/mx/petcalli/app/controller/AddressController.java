package mx.petcalli.app.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import mx.petcalli.app.model.Address;

public interface AddressController {
	
	// Nos permite controlar la respuesta 200, 201, 404, etc es como el optional
	ResponseEntity<Address> getAddressById(Integer id);
	
	//Obtener todas las direcciones 
	ResponseEntity< Iterable <Address> > getAllAddresses();
	
	//Crear una nueva dirección
	ResponseEntity <Address> createAddress(Address newAddress);
	
	//Actualizar una dirección existente 
	ResponseEntity <Address> updateAddress(Address address, Integer id);
	
	//Eliminar una dirección
	//Se ocupa el Void para decir que es un elemento vacio, sin respuesta
	ResponseEntity <Void> deleteAddress(Integer id);
	
}
