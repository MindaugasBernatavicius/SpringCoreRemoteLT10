package cf.mindaugas._02_packageStructure.repository;

import cf.mindaugas._02_packageStructure.model.Customer;

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
