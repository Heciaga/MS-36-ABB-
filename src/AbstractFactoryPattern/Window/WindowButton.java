package AbstractFactoryPattern.Window;

import AbstractFactoryPattern.Button;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("Window button");
    }
}
