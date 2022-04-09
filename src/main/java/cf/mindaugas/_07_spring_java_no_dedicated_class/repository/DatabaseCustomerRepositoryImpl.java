package cf.mindaugas._07_spring_java_no_dedicated_class.repository;

import cf.mindaugas._07_spring_java_no_dedicated_class.model.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// @Repository("customerRepository")
@Repository
// @Component
public class DatabaseCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("Jonas from database!");
        customer.setLastname("Jonaitis");
        customers.add(customer);
        return customers;
    }
}
