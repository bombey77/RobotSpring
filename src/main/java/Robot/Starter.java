package Robot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("t1000_context.xml");
        ModelT1000 t1000 = (ModelT1000)context.getBean("t1000");
        //t1000.action();
    }
}
