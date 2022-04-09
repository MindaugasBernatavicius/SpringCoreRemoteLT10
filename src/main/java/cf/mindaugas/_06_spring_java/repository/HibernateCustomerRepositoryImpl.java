package cf.mindaugas._06_spring_java.repository;

import cf.mindaugas._06_spring_java.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// @Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
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