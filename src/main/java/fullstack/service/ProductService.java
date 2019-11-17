package fullstack.service;

import fullstack.model.Product;
import fullstack.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){
        System.out.println("product " + product +" added to db");
        return productRepository.save(product);
    }

    public void deleteProduct(Product product){
        productRepository.delete(product);
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).get();
    }

    private ProductRepository productRepository;
}
