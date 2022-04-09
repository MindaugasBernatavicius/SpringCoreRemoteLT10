package cf.mindaugas._07_spring_java_no_dedicated_class.repository;

import cf.mindaugas._07_spring_java_no_dedicated_class.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}