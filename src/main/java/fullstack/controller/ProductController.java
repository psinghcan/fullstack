package fullstack.controller;

import fullstack.model.Product;
import fullstack.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class ProductController {
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PutMapping("/products/{id}")
    public Product editProduct(@PathVariable Long id, @RequestBody Product product){
        product.setId(id);
        return productService.saveProduct(product);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    private ProductService productService;
}
