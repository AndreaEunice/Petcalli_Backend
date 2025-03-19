package mx.petcalli.app.service.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import mx.petcalli.app.model.Address;
import mx.petcalli.app.repository.AddressRepository;
import mx.petcalli.app.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address createAddress(Address address) {
        address.setId(null); // Garantizamos que sea un nuevo registro
        return addressRepository.save(address);
    }

    @Override
    public Address getAddressById(Integer id) {
        Optional<Address> existingAddress = addressRepository.findById(id);
        return existingAddress.orElseThrow(() -> 
            new IllegalStateException("Address does not exist with id " + id));
    }

    @Override
    public Address getAddressByStreet(String street) {
        Iterable<Address> addresses = addressRepository.findByStreet(street);
        for (Address address : addresses) {
            return address;
        }
        throw new IllegalStateException("Address no existe con la calle " + street);
    }


    @Override
    public Address getAddressByCity(String city) {
        Iterable<Address> addresses = addressRepository.findByCity(city);
        for (Address address : addresses) {
            return address; // Retorna el primer resultado
        }
        throw new IllegalStateException("Address no existe con la ciudad " + city);
    }

    @Override
    public Address getAddressByState(String state) {
        Iterable<Address> addresses = addressRepository.findByState(state);
        for (Address address : addresses) {
            return address; // Retorna el primer resultado
        }
        throw new IllegalStateException("Address no existe con el estado " + state);
    }

    @Override
    public Address getAddressByZip(Integer zip) {
        Iterable<Address> addresses = addressRepository.findByZip(zip);
        for (Address address : addresses) {
            return address; // Retorna el primer resultado
        }
        throw new IllegalStateException("Address no existe con el código postal " + zip);
    }

    @Override
    public Address getAddressByCountry(String country) {
        Iterable<Address> addresses = addressRepository.findByCountry(country);
        for (Address address : addresses) {
            return address; // Retorna el primer resultado
        }
        throw new IllegalStateException("Address no existe con el país " + country);
    }


    @Override
    public Iterable<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address updateAddress(Address address, Integer id) {
        Address existingAddress = getAddressById(id);
        existingAddress.setStreet(address.getStreet());
        existingAddress.setCity(address.getCity());
        existingAddress.setState(address.getState());
        existingAddress.setZip(address.getZip());
        existingAddress.setCountry(address.getCountry());
        return addressRepository.save(existingAddress);
    }

    @Override
    public void deleteAddress(Integer id) {
        Address existingAddress = getAddressById(id);
        addressRepository.delete(existingAddress);
    }
}