package AspectTest;

import org.springframework.stereotype.Component;

@Component
public class SubscriptionOfFairytaile {

    public void title() {
        System.out.println("--- Title ---");
    }

    public void end() {
        System.out.println("--- The end ---");
    }

    public Object print(Object o) {
        return o;
    }
}
