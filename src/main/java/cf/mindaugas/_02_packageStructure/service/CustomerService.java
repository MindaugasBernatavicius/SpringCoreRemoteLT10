package cf.mindaugas._02_packageStructure.service;

import cf.mindaugas._02_packageStructure.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}