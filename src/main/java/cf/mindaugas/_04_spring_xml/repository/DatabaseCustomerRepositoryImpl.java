package cf.mindaugas._04_spring_xml.repository;

import cf.mindaugas._04_spring_xml.model.Customer;

import java.util.ArrayList;
import java.util.List;

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
