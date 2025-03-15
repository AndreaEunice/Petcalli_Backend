package mx.petcalli.app.service.impl;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import mx.petcalli.app.repository.ProductRepository;
import mx.petcalli.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	
	ProductServiceImpl(ProductRepository productRepository){
		this.productRepository = productRepository;
	}
	
	
	@Override
	public mx.petcalli.app.model.Product createProduct(mx.petcalli.app.model.Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductByBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductByFk1(String fk1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductByImage(String image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductByPrice(Double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductByDescription(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductByFk2(String fk2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductByColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product getProductBySize(String size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<mx.petcalli.app.model.Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<mx.petcalli.app.model.Product> getAllProducts(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public mx.petcalli.app.model.Product updateProduct(mx.petcalli.app.model.Product product, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Product(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
