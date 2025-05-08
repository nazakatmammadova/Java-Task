package org.example.annotation;

public class Dog {
//    @Important(size=3)
    @Important  ///  default yazilanda size yazilmasada problem olmur
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
