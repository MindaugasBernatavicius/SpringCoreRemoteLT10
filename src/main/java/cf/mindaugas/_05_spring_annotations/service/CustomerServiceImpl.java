package cf.mindaugas._05_spring_annotations.service;

import cf.mindaugas._05_spring_annotations.model.Customer;
import cf.mindaugas._05_spring_annotations.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired // property autowiring
    private CustomerRepository customerRepository;

    // public CustomerServiceImpl() {
    // }

    // @Autowired // constructor injection
    // public CustomerServiceImpl(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    // used for setter autowiring byName
    // public void setdbrepo(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    // used for setter autowiring byType
    // @Autowired
    // public void setCustomerRepository(CustomerRepository customerRepositoryx) {
    //     this.customerRepository = customerRepositoryx;
    // }


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}