package org.example;

import org.example.taskPatterns.Computer;
import org.example.taskPatterns.ComputerBuilder;
import org.example.taskPatterns.ComputerFactory;

public class Main {
    public static void main(String[] args) {
        ////builder;
//        PizzaBuilder pizzaBuilder=new PizzaBuilder("medium");
//        Pizza pizza=pizzaBuilder
//                .setCheese(true)
//                .setOlives(true)
//                .setPepperoni(false)
//                .setMushrooms(true)
//                .build();
//        System.out.println(pizza);

        ////factory
//        Payment payment= PaymentFactory.getPaymentMethod("Cash");
//        try {
//            payment.pay(200);
//        }catch (RuntimeException e){
//            System.err.println("Xeta bas verdi");
//        }
         /// /// factory & builder
        Computer base = ComputerFactory.createComputer("Laptop");
        Computer custom = new ComputerBuilder(base)
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGPU("NVIDIA MX450")
                .build();

        System.out.println(custom);


    }
}