package cf.mindaugas._06_spring_java.service;

import cf.mindaugas._06_spring_java.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}