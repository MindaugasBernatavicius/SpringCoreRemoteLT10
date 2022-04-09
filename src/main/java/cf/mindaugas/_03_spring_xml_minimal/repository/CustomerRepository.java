package cf.mindaugas._03_spring_xml_minimal.repository;

import cf.mindaugas._03_spring_xml_minimal.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}