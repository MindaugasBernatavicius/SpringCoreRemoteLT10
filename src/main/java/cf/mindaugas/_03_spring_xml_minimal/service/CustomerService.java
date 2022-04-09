package cf.mindaugas._03_spring_xml_minimal.service;

import cf.mindaugas._03_spring_xml_minimal.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}