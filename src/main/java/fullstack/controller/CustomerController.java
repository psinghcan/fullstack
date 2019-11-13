package fullstack.controller;

import fullstack.model.Customer;
import fullstack.service.CustomerService;
import fullstack.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @PutMapping("/customers/{id}")
    public Customer editCustomer(@PathVariable Long id, @RequestBody Customer customer){
        customer.setId(id);

        return customerService.saveCustomer(customer);
    }

    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    private CustomerService customerService;

}
