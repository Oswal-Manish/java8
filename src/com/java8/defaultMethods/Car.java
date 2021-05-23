package com.java8.defaultMethods;
public class Car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }

    
	/*
	 * Note this also access specifier is public as Java compiler adds public and
	 * abstract keywords before the interface method. Moreover, it adds public,
	 * static and final keywords before data members
	 */
    @Override
	public void overrideDefaultMethod() {
		System.out.println(" Parent class default method overridden !!! ");
	}

//    @Override --> Compilation Error
    public static void overrideStaticMethodNotAllowed() {
		System.out.println(" Parent class Static method override Not ALLOWED  !!! ");
	}


	public static void main(String args[]){
    	Vehicle car = new Car();
        car.cleanVehicle();
        car.overrideDefaultMethod();
        car.startVehicle();
        car.overrideDefaultMethod();
        Vehicle.overrideStaticMethodNotAllowed();
    }
}
