package FactoryPattern;

public class CardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Card payment!");
    }
}
