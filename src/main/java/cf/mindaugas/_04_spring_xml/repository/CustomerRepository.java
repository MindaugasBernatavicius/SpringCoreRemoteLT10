package cf.mindaugas._04_spring_xml.repository;

import cf.mindaugas._04_spring_xml.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}