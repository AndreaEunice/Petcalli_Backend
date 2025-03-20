/*package mx.petcalli.app.repository;


import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import mx.petcalli.app.model.Product;

import mx.petcalli.app.model.Vendor;

public interface VendorRepository extends CrudRepository<Vendor, Integer>, PagingAndSortingRepository<Vendor, Integer>{
	Set<Vendor> findByNameStore(String nameStore);
	Set<Vendor> findByRfc(String rfc);

	Set<Vendor> findAllByUrl(String url);
	Set<Vendor> findAllByStoreDescription(String storeDescription);
	Set<Vendor> findAllByTermsConditionUrl(String termsConditionUrl);
	

	// Page<Product> findAllByActiveTrue(Pageable pageable);
	// Page<Product> findAllByActiveFalse(Pageable pageable);
}

*/