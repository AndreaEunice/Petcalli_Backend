package mx.petcalli.app.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import mx.petcalli.app.model.Product;
import mx.petcalli.app.repository.ProductRepository;
import mx.petcalli.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        product.setId(product.getId());
        product.setTitle(product.getTitle().toUpperCase());
        product.setBrand(product.getBrand().toUpperCase());
        product.setColor(product.getColor().toUpperCase());
        product.setSize(product.getSize().toUpperCase());
        product.setImage(product.getImage().toLowerCase());
        product.setDescription(product.getDescription().toUpperCase());
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException("Product does not exist with id " + id));
    }

    @Override
    public Iterable<Product> getProductByTitle(String title) {
        return productRepository.findByTitle(title);
        
        }
     
    @Override
    public Iterable<Product> getProductByBrand(String brand) {
        return productRepository.findByBrand(brand);
        }

    @Override
    public Iterable<Product> getProductByDescription(String description) {
        return productRepository.findByDescription(description);
        }
    
    @Override
    public Iterable<Product> getProductByImage(String image) {
        return productRepository.findByImage(image);
        }
    
    @Override
    public Iterable<Product> getProductByColor(String color) {
        return productRepository.findByColor(color);
        }
    
    @Override
    public Iterable<Product> getProductBySize(String size) {
        return productRepository.findBySize(size);
        }
    
    @Override
    public Iterable<Product> getProductByPrice(Double price) {
        return productRepository.findByPrice(price);
        }
    
    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product, int id) {
        Product existingProduct = getProductById(id);
        existingProduct.setTitle(product.getTitle().toUpperCase());
        existingProduct.setBrand(product.getBrand().toUpperCase());
        existingProduct.setColor(product.getColor().toUpperCase());
        existingProduct.setSize(product.getSize().toUpperCase());
        existingProduct.setImage(product.getImage().toLowerCase());
        existingProduct.setDescription(product.getDescription().toUpperCase());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }

    @Override
    public void deleteProduct(int id) {
        Product existingProduct = getProductById(id);
        productRepository.delete(existingProduct);
    }

    @Override
    public Page<Product> getAllProducts(int pageNumber, int pageSize) {
        return productRepository.findAll(PageRequest.of(pageNumber, pageSize));
    }

}