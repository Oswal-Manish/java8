package com.java8.defaultMethods;

public class Child extends Parent{

	@Override
	public void m1() {
		System.out.println("Non Static method overriden !!! ");
	}
 
//	@Override --> Compilation error 
	public static void m2() {
		 System.out.println("Static method from class Child !!");
	 }
	
	public static void main(String[] args) {
		Parent obj = new Child();
		obj.m1();
		obj.m2();// This is not overridden and calls the ref objects method !! 
		Child obj1 = new Child();
		obj1.m1();
		obj1.m2();// This is not overridden and calls the ref objects method !! 
	}
}
