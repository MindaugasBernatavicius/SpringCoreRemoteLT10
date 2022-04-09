package cf.mindaugas._04_spring_xml.service;

import cf.mindaugas._04_spring_xml.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}