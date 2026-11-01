package AbstractFactoryPattern.Mac;

import AbstractFactoryPattern.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Mac checkbox");
    }
}
