package AspectTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditor {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("taile_bean.xml");
        Fairytaile fairytaile = (Fairytaile)context.getBean("fairytaile");
        fairytaile.textFairytaile();
    }
}
