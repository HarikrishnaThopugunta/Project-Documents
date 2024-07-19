package com.itcinfotech.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExampleReflection {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        exampleReflection();
    }
    private static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        //Knowing only one constructor taking it using index
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("Reflected hashcode singleton :"+ lazySingleton.hashCode());
        System.out.println("Singleton instance : "+ instance.hashCode());

        //Solution to this is go by enum
        EnumSingleton.INSTANCE.doSomething();
    }


}
