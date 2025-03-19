package mx.petcalli.app.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.petcalli.app.controller.ProductCategoryController;
import mx.petcalli.app.model.ProductCategory;
import mx.petcalli.app.service.ProductCategoryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/productCategory") // localhost:8080/api/v1/productCateogry
public class ProductCategoryControllerImpl implements ProductCategoryController {

	private final ProductCategoryService productCategoryService;
	
	public ProductCategoryControllerImpl(ProductCategoryService productCategoryService) {
		this.productCategoryService = productCategoryService;
	}

	@Override
	@GetMapping("{id}")
	public ResponseEntity<ProductCategory> getProductCategoryByIdUsingResponseEntity(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(productCategoryService.getProductCategoryById(id));
	}

	@Override
	@PostMapping
	public ResponseEntity<ProductCategory> createProductCategory(@RequestBody ProductCategory newproductCategory) {
		return ResponseEntity.status(201).body(productCategoryService.createProductCategory(newproductCategory));
	}

	@Override
	@GetMapping
	public ResponseEntity<Iterable<ProductCategory>> getAllProductCategories() {
		Iterable<ProductCategory> productCategories = productCategoryService.getAllProductCategories();
		return ResponseEntity.ok( productCategories  );
	}

	@Override
	@PutMapping("{id}")
	public ResponseEntity<ProductCategory> updateProductCategory(@RequestBody ProductCategory productCategory,@PathVariable("id") Integer id) {
		return ResponseEntity.ok(productCategoryService.updateProductCategory(productCategory, id));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<Void> deleteProductCategory(@PathVariable("id") Integer id) {
		productCategoryService.deleteProductCategory(id);
		return ResponseEntity.noContent().build();
	}


}
