package cf.mindaugas._04_spring_xml;

import cf.mindaugas._04_spring_xml.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
    }
}
