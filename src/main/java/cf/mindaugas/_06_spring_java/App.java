package cf.mindaugas._06_spring_java;

import cf.mindaugas._06_spring_java.repository.CustomerRepository;
import cf.mindaugas._06_spring_java.repository.DatabaseCustomerRepositoryImpl;
import cf.mindaugas._06_spring_java.repository.HibernateCustomerRepositoryImpl;
import cf.mindaugas._06_spring_java.service.CustomerService;
import cf.mindaugas._06_spring_java.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// // setter injection
// @Configuration
// class AppConfig {
//     @Bean(name = "customerRepository")
//     public CustomerRepository getCustomerRepository() {
//         return new HibernateCustomerRepositoryImpl();
//     }
//
//     @Bean(name = "customerService")
//     public CustomerService getCustomerService() {
//         CustomerServiceImpl customerService = new CustomerServiceImpl();
//         customerService.setCustomerRepository(getCustomerRepository());
//         return customerService;
//     }
// }

// // constructor injection
// @Configuration
// class AppConfig {
//     @Bean(name = "customerRepository")
//     public CustomerRepository getCustomerRepository() {
//         return new DatabaseCustomerRepositoryImpl();
//     }
//
//     @Bean(name = "customerService")
//     public CustomerService getCustomerService() {
//         CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//         return customerService;
//     }
// }

@Configuration
@ComponentScan({"cf.mindaugas._06_spring_java"})
class AppConfig { }

public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service1.findAll().get(0).getFirstname());
    }
}
