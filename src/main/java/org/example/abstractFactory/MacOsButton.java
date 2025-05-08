package org.example.abstractFactory;

public class MacOsButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOs Button paint!");
    }
}
