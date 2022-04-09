package cf.mindaugas._02_packageStructure.service;

import cf.mindaugas._02_packageStructure.model.Customer;
import cf.mindaugas._02_packageStructure.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}