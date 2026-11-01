package AbstractFactoryPattern.Mac;

import AbstractFactoryPattern.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Mac button");
    }
}
