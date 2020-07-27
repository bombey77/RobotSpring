package Robot;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("school_context.xml");
        School school = (School)context.getBean("school");
        System.out.println(school);
    }
}
