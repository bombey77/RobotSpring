package ZPSchool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        School104 school104 = (School104) context.getBean("makeBean");
        System.out.println(school104);

        ((AbstractApplicationContext)context).close();
//        ((ClassPathXmlApplicationContext)context).registerShutdownHook();
    }
}
