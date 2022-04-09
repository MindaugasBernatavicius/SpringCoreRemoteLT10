package cf.mindaugas._01_dependencyInjectionAndInversionServiceRepo;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new DatabaseCustomerRepositoryImpl();
        CustomerService service = new CustomerServiceImpl(customerRepository);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}


// class CustomerService {
//     // no D.I. - hardcoded dependency
//     private Repository customerRepository = new CustomerRepository();
//
//     // with D.I. - we inject the object to the class instead of it creating the object
//     private Repository cr;
//
//     // setter injection
//     public void setRepository(Repository cr){ this.cr = cr; }
//
//     // constructor injection
//     public CustomerService(Repository cr){ this.cr = cr; }
// }


// service
interface CustomerService {
    List<Customer> findAll();
}

class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}


// repository
interface CustomerRepository {
    List<Customer> findAll();
}

class DatabaseCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("Jonas from database");
        customer.setLastname("Jonaitis");
        customers.add(customer);
        return customers;
    }
}

class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("Petras");
        customer.setLastname("Petraitis");
        customers.add(customer);
        return customers;
    }
}


// model bean / pojo
class Customer {
    private String firstname;
    private String lastname;
    public Customer () {}
    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
}
