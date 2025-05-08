package org.example.abstractFactory;

public class MacOsCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("MacOs Chekbox paint!");
    }
}
