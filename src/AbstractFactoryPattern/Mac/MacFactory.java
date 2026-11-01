package AbstractFactoryPattern.Mac;

import AbstractFactoryPattern.Button;
import AbstractFactoryPattern.Checkbox;
import AbstractFactoryPattern.UIFactory;

public class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
