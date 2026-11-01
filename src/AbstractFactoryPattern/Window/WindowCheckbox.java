package AbstractFactoryPattern.Window;

import AbstractFactoryPattern.Checkbox;

public class WindowCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Window checkbox");
    }
}
