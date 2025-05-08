package org.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Dog dog=new Dog("Jack",2);

        Field[] fields=dog.getClass().getDeclaredFields();
        for(Field field:fields){
           Annotation[] annotations=field.getAnnotations();
           Important important=field.getAnnotation(Important.class);
           if(important!=null){
               int a=important.size();
               for(Annotation annotation:annotations){
                   Boolean isImportantAnnotation=annotation.annotationType().equals(Important.class);
                   if(isImportantAnnotation.equals(Boolean.TRUE)){
                       field.setAccessible(true);
                       field.set(dog,"Max");
                       System.err.println(a);
                   }
               }
           }

        }
        System.out.println(dog);
    }
}
