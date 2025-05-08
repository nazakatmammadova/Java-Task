package org.example.abstractFactory;

public class WindowsCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Windows checkbox paint!");
    }
}
