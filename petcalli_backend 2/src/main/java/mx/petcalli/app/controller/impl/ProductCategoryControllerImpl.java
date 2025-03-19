package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.ProductCategoryController;
import mx.petcalli.app.model.ProductCategory;
import mx.petcalli.app.service.ProductCategoryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/productCategory") // localhost:8080/api/v1 
public class ProductCategoryControllerImpl implements ProductCategoryController {

	private final ProductCategoryService productCategoryService;
	
	public ProductCategoryControllerImpl(ProductCategoryService productCategoryService){
		this.productCategoryService =productCategoryService;
	}
	
	@Override
	public ProductCategory getProductCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ProductCategory> getProductCategoryByIdUsingResponseEntity(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ProductCategory> createProductCategory(ProductCategory newproductCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Iterable<ProductCategory>> getAllProductCategories() {
		Iterable<ProductCategory> productCategories = productCategoryService.getAllProductCategories();
		return ResponseEntity.ok( productCategories  );
	}

	@Override
	public ResponseEntity<ProductCategory> updateProductCategory(ProductCategory productCategory, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Void> deleteProductCategory(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
