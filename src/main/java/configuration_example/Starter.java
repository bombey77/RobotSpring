package configuration_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        PersonBean personBean = context.getBean("personBean", PersonBean.class);
        System.out.println(personBean.getName());
        System.out.println(personBean.getSureName());

//        Roman
//        Moto
    }
}
