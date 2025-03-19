package mx.petcalli.app.controller;

import org.springframework.http.ResponseEntity;

import mx.petcalli.app.model.ProductCategory;


public interface ProductCategoryController {
	
	ProductCategory getProductCategoryById(int id);

	ResponseEntity<ProductCategory> getProductCategoryByIdUsingResponseEntity(Integer id);

	ResponseEntity<ProductCategory> createProductCategory(ProductCategory newproductCategory);

    ResponseEntity<Iterable<ProductCategory>> getAllProductCategories();

    ResponseEntity<ProductCategory> updateProductCategory(ProductCategory productCategory,Integer id);

    ResponseEntity<Void> deleteProductCategory(Integer id);
}
