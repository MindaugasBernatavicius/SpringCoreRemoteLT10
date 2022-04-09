package cf.mindaugas._07_spring_java_no_dedicated_class.service;

import cf.mindaugas._07_spring_java_no_dedicated_class.model.Customer;
import cf.mindaugas._07_spring_java_no_dedicated_class.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service("customerService")
// @Service
@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // public CustomerServiceImpl(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}