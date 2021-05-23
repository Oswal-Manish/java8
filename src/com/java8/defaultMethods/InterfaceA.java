package com.java8.defaultMethods;
public interface InterfaceA {

    default void printSomething() {
        System.out.println("I am inside A interface");
    }
}