package org.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        User user=new User("Nazli",21);
//        System.out.println(user);
//        Field[] fields=user.getClass().getDeclaredFields();
//        for(Field field : fields){
//            if(field.getName().equals("name")){
//                field.setAccessible(true);
//                field.set(user,"Kenan");
//            }
//        }
//        System.err.println(user);

        /// Method
        Method[] methods=user.getClass().getDeclaredMethods();
        for(Method method : methods){
//            System.err.println(method.getName());
            if(method.getName().equals("staticMethod")){
                method.setAccessible(true); /// private olan metodlarida cagirmaga imkan yaradir hemin kodu qirir.
                method.invoke(user);
            }
        }
    }
}
