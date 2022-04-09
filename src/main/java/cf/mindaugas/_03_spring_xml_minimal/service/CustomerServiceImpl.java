package cf.mindaugas._03_spring_xml_minimal.service;

import cf.mindaugas._03_spring_xml_minimal.model.Customer;
import cf.mindaugas._03_spring_xml_minimal.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {
    }

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImpl(CustomerRepository customerRepository, String name) {
        this.customerRepository = customerRepository;
        System.out.println(name);
    }

    // used for setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}