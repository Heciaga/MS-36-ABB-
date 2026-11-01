package FactoryPattern;

public class PaymentFactory {
    public static Payment createPayment(String type) {
        if (type.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        }

        if (type.equalsIgnoreCase("PAYPAL")) {
            return new PaypalPayment();
        }

        throw new IllegalArgumentException(
                "Unknown payment type"
        );
    }
}
