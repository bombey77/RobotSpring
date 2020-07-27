package property_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property_context.xml");
        RockMusic rockSong = context.getBean("rockSong", RockMusic.class);
        rockSong.play();

        ((ConfigurableApplicationContext)context).close();
    }
}
