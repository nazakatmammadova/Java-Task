package org.example.abstractFactory;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
    public static GUIFactory getFactory(String factory){
        if(factory.equals("Mac")){
            return new MacOsFactory();
        }else if(factory.equals("Win")){
            return new WindowsFactory();
        }else{
            return null;
        }
    }
}
