package mx.petcalli.app.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ecommerce.app.repository.CustomerRepository;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductCategory getProductCategoryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ProductCategory> getAllProductCategories(boolean isActive, int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductCategory updateCustomer(ProductCategory productCategory, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductCategory(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
