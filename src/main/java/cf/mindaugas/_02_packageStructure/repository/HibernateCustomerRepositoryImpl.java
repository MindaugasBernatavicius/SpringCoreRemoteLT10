package cf.mindaugas._02_packageStructure.repository;

import cf.mindaugas._02_packageStructure.model.Customer;

import java.util.ArrayList;
import java.util.List;

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