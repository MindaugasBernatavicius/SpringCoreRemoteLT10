package cf.mindaugas._04_spring_xml.service;

import cf.mindaugas._04_spring_xml.model.Customer;
import cf.mindaugas._04_spring_xml.repository.CustomerRepository;

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

    // used for setter autowiring byName
    // public void setdbrepo(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    // used for setter autowiring byType
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}