package cf.mindaugas._05_spring_annotations.repository;

import cf.mindaugas._05_spring_annotations.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}