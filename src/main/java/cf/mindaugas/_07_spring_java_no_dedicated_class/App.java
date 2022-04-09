package cf.mindaugas._07_spring_java_no_dedicated_class;

import cf.mindaugas._07_spring_java_no_dedicated_class.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"cf.mindaugas._07_spring_java_no_dedicated_class"})
public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(App.class);
        // CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
        CustomerService service1 = appContext.getBean(CustomerService.class);
        System.out.println(service1.findAll().get(0).getFirstname());
    }
}
