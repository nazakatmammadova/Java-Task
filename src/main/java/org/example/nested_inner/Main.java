package org.example.nested_inner;

public class Main {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Nested nested=new Outer.Nested();
        nested.setName("Nazli");

        Outer.Inner inner=new Outer().new Inner();
        inner.getSurname();
    }
}
