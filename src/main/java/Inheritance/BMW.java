package Inheritance;

public class BMW extends Car {

	int speed =200;
	
	//when u have a method in the parent class in same method in child class
	//1.with same method name 
	//2.with same number of parameter
	//3.with the same return type +same type of parameter
	//4.with same sequence of parameter
	//5.we will also call run time  polymorphism or dynamic polymorphism 
	
	@Override
	public void start() {
		System.out.println("BMW....start");
	}
	
	//method hiding
	public static void getName() {
		System.out.println("BMW...getName");
	}

	public void autopark() {
		System.out.println("BMW....autopark");
	}
	
}
