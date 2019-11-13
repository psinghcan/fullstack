package fullstack.controller;

import fullstack.model.*;
import fullstack.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    public MainController(PurchaseService purchaseService, ProductService productService, CustomerService customerService, PersonService personService, PurchaseItemService purchaseItemService) {
        this.purchaseService = purchaseService;
        this.productService = productService;
        this.customerService = customerService;
        this.personService = personService;
        this.purchaseItemService = purchaseItemService;
    }

    @PostMapping("/purchase")
    public ResponseEntity<?> addPurchase(@RequestBody Purchase purchase){
        return null;
    }

    @PostMapping("/customer")
    public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
        return null;
    }

    @PostMapping("/person")
    public ResponseEntity<?> addPerson(@RequestBody Person person){
        return null;
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        return null;
    }

    @PostMapping("/purchaseItem")
    public ResponseEntity<?> addPurchaseItem(@RequestBody PurchaseItem purchaseItem){
        return null;
    }

    private PurchaseService purchaseService;
    private ProductService productService;
    private CustomerService customerService;
    private PersonService personService;
    private PurchaseItemService purchaseItemService;
}
