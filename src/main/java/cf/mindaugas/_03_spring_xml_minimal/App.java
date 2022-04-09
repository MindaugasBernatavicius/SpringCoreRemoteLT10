package cf.mindaugas._03_spring_xml_minimal;

import cf.mindaugas._03_spring_xml_minimal.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // CustomerRepository customerRepository = new DatabaseCustomerRepositoryImpl();
        // CustomerService service = new CustomerServiceImpl(customerRepository);

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml-minimal.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
    }
}
