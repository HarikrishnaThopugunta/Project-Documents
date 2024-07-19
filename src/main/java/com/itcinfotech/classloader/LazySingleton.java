package com.itcinfotech.classloader;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton instance = null;

    private LazySingleton() {
        System.out.println("private constructor called!");
    }

    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}