package org.example.factory;

public class PaymentFactory {
    public static Payment getPaymentMethod(String paymentType) {
        return switch (paymentType){
            case "Card"-> new CardPayment();
            case "Cash"->new CashPayment();
            default -> null;
        };
    }
}
