package com.java8.defaultMethods;

public class DiamondProblem implements InterfaceA, InterfaceB {

	/*
	 * As both interfaces defines the same method this gives compilation error 
	 * and needs to be corrected by Overriding in Child class 
	 * We can also call Parent Class method using InterfaceA.super.printSomething() 
	 */
	@Override
	public void printSomething() {
		// TODO Auto-generated method stub
		System.out.println("Overridden printSomething !!! ");
		
		
		InterfaceA.super.printSomething();
		//InterfaceB.super.printSomething();
	}
	
	public static void main(String[] args) {
		DiamondProblem obj = new DiamondProblem();
		obj.printSomething();
	}

}
