package main.java.mx.petcalli.app.controller.impl;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.VendorController;
import mx.petcalli.app.model.Vendor;
import mx.petcalli.app.service.VendorService;

@RestController
public class VendorControllerImpl implements VendorController{
	
	private final VendorService vendorService;
	
	public VendorControllerImpl(VendorService vendorService) {
		this.vendorService = vendorService;
	}
	@Override
	public ResponseEntity<Vendor> getVendorId(int id) {
		return null;
	}

	@Override
	public ResponseEntity<Vendor> getByVendor() {
		return null;
	}
	
	@GetMapping("api/v1/Vendors")
	@Override
	public ResponseEntity<Set<Vendor>> getAllVendor() {
		return null;
	}

	@Override
	public ResponseEntity<Vendor> createVendor(Vendor newVendor) {
		
		return null;
	}

	@Override
	public ResponseEntity<Vendor> updateVendor(Vendor vendor, int id) {

		return null;
	}

	@Override
	public ResponseEntity<Void> deleteVendor(int id) {
		
		return null;
	}
	

}
