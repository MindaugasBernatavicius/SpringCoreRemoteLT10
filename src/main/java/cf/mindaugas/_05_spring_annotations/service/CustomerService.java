package cf.mindaugas._05_spring_annotations.service;

import cf.mindaugas._05_spring_annotations.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}