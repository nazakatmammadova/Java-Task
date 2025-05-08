package org.example.reflection;

public class User {
    private String name;
    private final Integer age;

    public User(String name,Integer age) {
        this.name=name;
        this.age = age;
    }

    public void NonStaticMethod(){
        System.out.println("Non static method proccess!");
    }
    public static void staticMethod(){
        System.out.println("static methods!");
    }
    private void PrivNonStaticMethod(){
        System.out.println("priv method");
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
