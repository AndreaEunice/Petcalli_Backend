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
        // product.setProductCategory(product.getProductCategory());
        product.setDescription(product.getDescription().toUpperCase());
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException("Product does not exist with id " + id));
    }

    @Override
    public Product getProductByTitle(String title) {
        Iterable<Product> products = productRepository.findByTitle(title);
        for (Product product : products) {
            return product; 
        }
        throw new IllegalStateException("Product does not exist with title " + title);
    }

    @Override
    public Product getProductByBrand(String brand) {
        Iterable<Product> products = productRepository.findByBrand(brand);
        for (Product product : products) {
            return product; 
        }
        throw new IllegalStateException("Product does not exist with brand " + brand);
    }

    @Override
    public Product getProductByDescription(String description) {
        Iterable<Product> products = productRepository.findByDescription(description);
        for (Product product : products) {
            return product;
        }
        throw new IllegalStateException("Product does not exist with description " + description);
    }

    @Override
    public Product getProductByColor(String color) {
        Iterable<Product> products = productRepository.findByColor(color);
        for (Product product : products) {
            return product;
        }
        throw new IllegalStateException("Product does not exist with color " + color);
    }

    @Override
    public Product getProductByImage(String image) {
        Iterable<Product> products = productRepository.findByImage(image);
        for (Product product : products) {
            return product; 
        }
        throw new IllegalStateException("Product does not exist with image " + image);
    }

    @Override
    public Product getProductBySize(String size) {
        Iterable<Product> products = productRepository.findBySize(size);
        for (Product product : products) {
            return product; 
        }
        throw new IllegalStateException("Product does not exist with size " + size);
    }
    
    @Override
    public Product getProductByPrice(Double price) {
        Iterable<Product> products = productRepository.findByPrice(price);
        for (Product product : products) {
            return product; 
        }
        throw new IllegalStateException("Product does not exist with price " + price);
    }
    
   /* @Override
 public Iterable<Product> getAllProductsByPetType(int PetType) {
     Iterable<Product> products = productRepository.findByPetType(PetType);
        for (Product product : products) {
          return (Iterable<Product>) product;
        }
        throw new IllegalStateException("Product does not exist with petType " + PetType);
    }
    
 @Override
 public Iterable<Product> getAllProductsByProductCategory(int productCategory) {
  Iterable<Product> products = productRepository.findByProductCategory(productCategory);
        for (Product product : products) {
            return (Iterable<Product>) product; 
        }
        throw new IllegalStateException("Product does not exist with petType " + productCategory);
    } */
    
    
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
        // existingProduct.setPetType(product.getPetType());
        // existingProduct.setProductCategory(product.getProductCategory());
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

 /*@Override
 public Product getProductByPetType(int petType) {
  // TODO Auto-generated method stub
  return null;
 }*/





}