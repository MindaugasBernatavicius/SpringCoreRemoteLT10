package cf.mindaugas._02_packageStructure.repository;

import cf.mindaugas._02_packageStructure.model.Customer;

import java.util.List;
public interface CustomerRepository {
    List<Customer> findAll();
}