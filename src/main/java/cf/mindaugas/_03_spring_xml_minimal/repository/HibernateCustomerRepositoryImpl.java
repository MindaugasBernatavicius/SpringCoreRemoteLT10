package cf.mindaugas._03_spring_xml_minimal.repository;

import cf.mindaugas._03_spring_xml_minimal.model.Customer;

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