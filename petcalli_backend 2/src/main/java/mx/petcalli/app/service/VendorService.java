package mx.petcalli.app.service;

import mx.petcalli.app.model.Vendor;

public interface VendorService {

	Vendor createVendor(Vendor vendor);
	Vendor getVendorById(Integer id);
	Vendor getVendorByFk1(String fk1);
	Vendor getVendorByNameStore(String nameStore);
	Vendor getVendorByRfc(String rfc);
	Vendor getVendorByUrl(String url);
	Vendor getVendorByStoreDescription(String storeDescription);
	Vendor getVendorByDescription(String description);
	Vendor getVendorByTermsConditionsUrl(String termsConditionsUrl);
	
}