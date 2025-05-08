package org.example.proxy;

public class Main {
    public static void main(String[] args) {
        ExpensiveObjectProxy proxy=new ExpensiveObjectProxy();
        proxy.process();
        proxy.process();
        proxy.process();
        proxy.process();
        proxy.process();
    }
}
