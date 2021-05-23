package com.java8.defaultMethods;

import java.util.Comparator;

public interface Vehicle {

    void cleanVehicle();
    public static final Comparator<Object> cmp = null;
    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }
    default void overrideDefaultMethod() {
        System.out.println(" Default Method in Parent class !!! ");
    }
    
    static void overrideStaticMethodNotAllowed() {
    	System.out.println(" Static Method in Parent class !!! ");
    }
}