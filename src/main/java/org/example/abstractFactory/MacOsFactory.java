package org.example.abstractFactory;

public class MacOsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacOsCheckbox();
    }
}
