package fullstack.controller;

import fullstack.model.*;
import fullstack.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.Random;

@RestController
@RequestMapping("/test")
public class TestController {

    public TestController(PurchaseService purchaseService, ProductService productService, CustomerService customerService, PersonService personService, PurchaseItemService purchaseItemService) {
        this.purchaseService = purchaseService;
        this.productService = productService;
        this.customerService = customerService;
        this.personService = personService;
        this.purchaseItemService = purchaseItemService;
    }

    public PurchaseItem getPurchaseItem(){
        Product product = getProduct();

        PurchaseItem purchaseItem = new PurchaseItem();
        purchaseItem.setProduct(product);
        purchaseItem.setAmount(100d);
        purchaseItem.setQuantity(100);

        return null;
    }

    @GetMapping("/customer")
    public Customer addCustomer(){
        return getCustomer();
    }

    @GetMapping("/person")
    public Person addPerson(){
        return getPerson();
    }

    @GetMapping("/product")
    public Product addProduct(){
        return getProduct();
    }




    private Product getProduct(){
        Product product = new Product();
        product.setPrice(new Random().nextDouble());
        product.setQuantity(100 * new Random().nextInt(10));
        product.setDescription("this is good");
        String sku = "" + (int)(Math.random()*((10)+1))+1;
        product.setSku(sku);
        product = productService.saveProduct(product);
        return product;
    }

    private Person getPerson(){
        Person person = new Person();
        person.setFirstName(getRandom());
        person.setLastName(getRandom());
        person.setPhone("444-222-1232");
        person = personService.addPerson(person);
        return person;
    }
    private Customer getCustomer(){
        Customer customer = new Customer();
        Person person = getPerson();
        person.setFirstName(getRandom());
        customer.setEmail(person.getFirstName() + "@nice.com");
        customer.setPerson(person);
        customer = customerService.saveCustomer(customer);
        return customer;
    }

    private String getRandom(){
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    private PurchaseService purchaseService;
    private ProductService productService;
    private CustomerService customerService;
    private PersonService personService;
    private PurchaseItemService purchaseItemService;
}
