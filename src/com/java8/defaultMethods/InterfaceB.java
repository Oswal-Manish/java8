package com.java8.defaultMethods;
public interface InterfaceB {

    default void printSomething() {
        System.out.println("I am inside B interface");
    }
}