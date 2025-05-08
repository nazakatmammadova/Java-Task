package org.example.nested_inner;

public class Outer {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    static class Nested{
        private String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    class Inner{
        private String surname;

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }
}
