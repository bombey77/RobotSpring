package Robot.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("school_context.xml");
        ClassList list = (ClassList)context.getBean("list");
        list.runningTest();

        MapList mapList = (MapList)context.getBean("maplist");
        mapList.print();
    }
}
