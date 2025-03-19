package mx.petcalli.app.service;

import mx.petcalli.app.model.Address;

public interface AddressService {
 
 // Se crea una dirección
 Address createAddress(Address address);
 
 // Se obtienen sus datos 
 Address getAddressById(Integer id);
 Address getAddressByStreet(String street); 
 Address getAddressByCity(String city); 
 Address getAddressByState(String state); 
 Address getAddressByZip(Integer zip); 
 Address getAddressByCountry(String country);
 
 // Se obtienen todas las direcciones 
 // SET no permite duplicados
 /*PAGE Se utiliza en aplicaciones web para 
  * mostrar conjuntos de datos grandes (como resultados de búsqueda) divididos en páginas más manejables.*/
  
 Iterable<Address> getAllAddress();
 
 //Se actualiza una dirección 
 Address updateAddress(Address address, Integer id); 
 
 //Se elimina una dirección
 
 void deleteAddress(Integer id);
 
}