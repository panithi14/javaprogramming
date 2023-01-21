package Inheritance;

public class Car extends Vehicle {
	
	final int speed=100;	
	//final method can not be overridden
	//final class can not have child class it can not be a parent or can not be inherited
	//final is used to prevent inheritance/method overriding
	//static method can not be overridden
	//static method can be overloaded
	//static method can be inherited
	public  void start() {
		System.out.println("car....start method");
	}
	
	public void stop() {
		System.out.println("car....stop method");
	}
	
	public void refuel() {
		System.out.println("car....refuel");
	}
	
	public static void getName() {
		System.out.println("car...getName");
	}

	
	//final keyword example 
	//page....final logo()
	//privacy link
	
}
