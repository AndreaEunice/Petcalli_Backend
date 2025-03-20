package mx.petcalli.app.repository;


import org.springframework.data.repository.CrudRepository;

import mx.petcalli.app.model.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Integer>{
	Iterable<Vendor> findByNameStore(String nameStore);
	Iterable<Vendor> findByRfc(String rfc);
    Iterable <Vendor> findAllByUrl(String url);
	Iterable<Vendor> findAllByStoreDescription(String storeDescription);
	Iterable<Vendor> findAllByTermsConditionUrl(String termsConditionUrl);
	
}