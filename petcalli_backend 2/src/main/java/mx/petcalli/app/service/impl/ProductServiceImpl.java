/*package mx.petcalli.app.service.impl;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import mx.petcalli.app.repository.ProductRepository;
import mx.petcalli.app.service.ProductService;
import mx.petcalli.app.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepository;
	
	ProductServiceImpl(ProductRepository productRepository){
		this.productRepository = productRepository;
	}
	
	
	@Override
	public Product createProduct(Product product) {
		return null;
	}

	@Override
	public Product getProductById(int id) {
		return null;
	}

	@Override
	public Product getProductByTitle(String title) {
		return null;
	}

	@Override
	public Product getProductByBrand(String brand) {
		return null;
	}

	@Override
	public Product getProductByFk1(String fk1) {
		return null;
	}

	@Override
	public Product getProductByImage(String image) {
		return null;
	}

	@Override
	public Product getProductByPrice(Double price) {
		return null;
	}

	@Override
	public Product getProductByDescription(String description) {
		return null;
	}

	@Override
	public Product getProductByFk2(String fk2) {
		return null;
	}

	@Override
	public Product getProductByColor(String color) {
		return null;
	}

	@Override
	public Product getProductBySize(String size) {
		return null;
	}

	@Override
	public Page<Product> getAllProducts(int pageNumber, int pageSize) {
		return null;
	}
	
	@Override
	public Set<Product> getAllProducts() {
		
		Iterable<Product> productsIterable = productRepository.findAll();
		return new LinkedHashSet<>((Collection<Product>)productsIterable );
	}

	@Override
 	public Product updateProduct(Product product, int id) {
 		return null;
 	}
 
 	@Override
 	public void deleteProduct(int id) {
 
 	}
}
*/
