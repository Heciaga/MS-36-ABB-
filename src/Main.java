import AbstractFactoryPattern.Button;
import AbstractFactoryPattern.Checkbox;
import AbstractFactoryPattern.UIFactory;
import AbstractFactoryPattern.Window.WindowFactory;
import BuilderPattern.User;
import FactoryPattern.Payment;
import FactoryPattern.PaymentFactory;
import PrototypePattern.Enemy;
import SingletonPattern.DatabaseConfig;


public class Main {
    public static void main(String[] args) {
        //Singleton Pattern
        DatabaseConfig config1 = DatabaseConfig.getInstance();
        DatabaseConfig config2 = DatabaseConfig.getInstance();
        System.out.println(config2 == config2);

        //FactoryPattern
        Payment payment = PaymentFactory.createPayment("CARD");
        payment.pay();

        //AbstractFactoryPattern
        UIFactory factory = new WindowFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();

        //BuiulderPattern
        User user = User.builder()
                .age(31)
                .email("zeynalovheci@gmail.com")
                .name("Haci")
                .build();

        System.out.println(user.getName());

        //Prototype Pattenr
        Enemy original = new Enemy("Qezenfer", 100, 10);

        Enemy enemy1 = original.clone();
        Enemy enemy2 = original.clone();

        enemy1.showInfo();
        enemy2.showInfo();
    }
}