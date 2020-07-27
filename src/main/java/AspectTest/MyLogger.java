package AspectTest;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {

    public void printValue(Object obj) {
        System.out.println("Print value");
        int x = (Integer) obj + 3;
        System.out.println(x);
    }

    public void init() {
        System.out.println("Init");
    }

    public void close() {
        System.out.println("Close");
    }
}
