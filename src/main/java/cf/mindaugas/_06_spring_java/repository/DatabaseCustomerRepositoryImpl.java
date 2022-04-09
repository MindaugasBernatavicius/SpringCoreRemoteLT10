package cf.mindaugas._06_spring_java.repository;

import cf.mindaugas._06_spring_java.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class DatabaseCustomerRepositoryImpl implements CustomerRepository {
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
