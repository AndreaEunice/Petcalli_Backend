package mx.petcalli.app.service;

import java.util.Set;

import org.springframework.data.domain.Page;

import mx.petcalli.app.model.Product;
import mx.petcalli.app.model.Vendor;

public interface VendorService {

	Product createVendor(Vendor vendor);
	Product getVendorById(Integer id);
	Product getVendorByFk1(String fk1);
	Product getVendorByNameStore(String nameStore);
	Product getVendorByRfc(String rfc);
	Product getVendorByUrl(String url);
	Product getVendorByStoreDescription(String storeDescription);
	Product getVendorByDescription(String description);
	Product getVendorByTermsConditionsUrl(String termsConditionsUrl);
	
	
	
}