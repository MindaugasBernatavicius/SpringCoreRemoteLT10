package cf.mindaugas._06_spring_java.repository;

import cf.mindaugas._06_spring_java.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}