package cf.mindaugas._05_spring_annotations;

import cf.mindaugas._05_spring_annotations.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-annotations.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
