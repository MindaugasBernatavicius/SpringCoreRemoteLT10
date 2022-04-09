package cf.mindaugas._07_spring_java_no_dedicated_class.service;

import cf.mindaugas._07_spring_java_no_dedicated_class.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}