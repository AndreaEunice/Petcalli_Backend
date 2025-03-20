package mx.petcalli.app.service.impl;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


import mx.petcalli.app.model.Vendor;
import mx.petcalli.app.repository.VendorRepository;
import mx.petcalli.app.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	private final VendorRepository vendorRepository;
	
	public VendorServiceImpl(VendorRepository vendorRepository){
		this.vendorRepository = vendorRepository;
	}
	
	
	@Override
	public  Vendor createVendor(Vendor vendor) {
		vendor.setId(null);
		vendor.setUserName(vendor.getUserName());
		return vendorRepository.save(vendor);
	}

	@Override
	public Vendor getVendorById(Integer id) {
		
		return null;
	}

	@Override
	public Vendor getVendorByFk1(String fk1) {
		
		return null;
	}

	@Override
	public Vendor getVendorByNameStore(String nameStore) {
		
		return null;
	}

	@Override
	public Vendor getVendorByRfc(String rfc) {
		
		return null;
	}

	@Override
	public Vendor getVendorByUrl(String url) {
		
		return null;
	}

	@Override
	public Vendor getVendorByStoreDescription(String storeDescription) {
		
		return null;
	}

	@Override
	public Vendor getVendorByTermsConditionsUrl(String termsConditionsUrl) {
		
		return null;
	}


	@Override
	public Vendor getVendorByDescription(String description) {
		return null;
	}

}  
