package org.example.factory;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Your card balance : "+ amount);
    }
}
