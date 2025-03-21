package mx.petcalli.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;


import mx.petcalli.app.model.ProductCategory;
import mx.petcalli.app.repository.ProductCategoryRepository;
import mx.petcalli.app.service.ProductCategoryService;

@Service 
public class ProductCategoryServiceImpl implements ProductCategoryService {

	private final ProductCategoryRepository productCategoryRepository;
	
	public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository) {
		this.productCategoryRepository = productCategoryRepository;
	}
	
	@Override
	public ProductCategory createProductCategory(ProductCategory productCategory) {
		Optional<ProductCategory> optionalProductCategory = productCategoryRepository.findByname(productCategory.getName());
		if(optionalProductCategory.isPresent()) {
			throw new IllegalStateException("This category already exist with the name: " + productCategory.getName());
		}
		// TODO Verify if the attributes are valid
		productCategory.setId(null); // Create the product category
		ProductCategory newProductCategory = productCategoryRepository.save( productCategory );
		return newProductCategory;
	}

	@Override
	public ProductCategory getProductCategoryById(Integer id) {
		Optional<ProductCategory> optionalProductCategory = productCategoryRepository.findById(id);
		if( optionalProductCategory.isEmpty()) {
			throw new IllegalStateException("Product Category does not exist with id: " + id);
		}
		ProductCategory existingProductCategory = optionalProductCategory.get();
		return existingProductCategory;
	}

	@Override
	public Iterable<ProductCategory> getAllProductCategories() {
		return productCategoryRepository.findAll();
	}
	
	@Override
	public ProductCategory updateProductCategory(ProductCategory productCategory, Integer id) {
		ProductCategory existingProductCategory = getProductCategoryById(id);
	    
	    existingProductCategory.setName(productCategory.getName());
	    //existingProductCategory.setDescription(productCategory.getDescription());
	    
	    return productCategoryRepository.save(existingProductCategory);
	}

	@Override
	public void deleteProductCategory(Integer id) {
		ProductCategory existingProductCategory = getProductCategoryById( id );
		productCategoryRepository.delete(existingProductCategory);		
	}


}

