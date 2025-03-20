package mx.petcalli.app.service;

import mx.petcalli.app.model.ProductCategory;

public interface ProductCategoryService {
	ProductCategory createProductCategory(ProductCategory productCategory);
	ProductCategory getProductCategoryById(Integer id);
	Iterable<ProductCategory> getAllProductCategories();
	ProductCategory updateProductCategory(ProductCategory productCategory, Integer id);
	void deleteProductCategory(Integer id);

}
