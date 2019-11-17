package fullstack;

import fullstack.model.Customer;
import fullstack.model.Person;
import fullstack.model.Product;
import fullstack.service.CustomerService;
import fullstack.service.PersonService;
import fullstack.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FullstackApplication {

    public static void main(String[] args) {
        SpringApplication.run(FullstackApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(){
        return args -> {
            System.out.println("application is starting");
            something();
            System.out.println("something is done");
        };
    }

    private void something(){
        for (int i=1; i<100; i++){
            addProduct(i);
            Person p =addPerson(i);
//            System.out.println(p);
            Customer c = addCustomer(i, p);
//            System.out.println(c);
        }
    }

    private void addProduct(int i){
        Product p = new Product();
        p.setDescription("very good toothpaste " + i);
        p.setId((long)i);
        p.setQuantity(10*i);
        p.setPrice(i*3.5);
        p.setSku("TTYY0" +i);
        productService.saveProduct(p);
    }

    private Person addPerson(int i){
        Person person = new Person();
        person.setFirstName("bablee" +i);
        person.setLastName("sharma");
        person.setId((long)i);
        person.setPhone("");
        personService.addPerson(person);
        return person;
    }


    private Customer addCustomer(int i, Person p){
        Customer customer = new Customer();
        customer.setEmail("bablee" +i +"laloo.com");
        customer.setId((long)i);
        customer.setPerson(p);
        customerService.saveCustomer(customer);
        return customer;
    }

    @Autowired
    PersonService personService;
    @Autowired
    ProductService productService;
    @Autowired
    CustomerService customerService;


}
