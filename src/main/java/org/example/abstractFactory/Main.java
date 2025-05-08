package org.example.abstractFactory;

public class Main {
    public static void main(String[] args) {

        try {
            GUIFactory factory=GUIFactory.getFactory("Win");
            Button button=factory.createButton();
            CheckBox checkBox=factory.createCheckbox();
            button.paint();
            checkBox.paint();
        }catch (Exception e){
            System.err.println("Xeta bas verdi!");
        }

    }
}
