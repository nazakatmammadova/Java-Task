package org.example.factory;

public class CashPayment  implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Your cash amount : "+ amount);
    }
}
