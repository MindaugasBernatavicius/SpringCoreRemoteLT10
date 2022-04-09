package cf.mindaugas._02_packageStructure;

import cf.mindaugas._02_packageStructure.repository.CustomerRepository;
import cf.mindaugas._02_packageStructure.repository.DatabaseCustomerRepositoryImpl;
import cf.mindaugas._02_packageStructure.service.CustomerService;
import cf.mindaugas._02_packageStructure.service.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new DatabaseCustomerRepositoryImpl();
        CustomerService service = new CustomerServiceImpl(customerRepository);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
