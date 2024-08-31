package lk.ijse.Beans;

import org.springframework.stereotype.Component;

@Component
public class ChickenRoll implements Bakery{
    @Override
    public void eat() {
        System.out.println("eat");
    }
}
