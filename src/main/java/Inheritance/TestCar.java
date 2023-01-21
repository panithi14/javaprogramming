package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.stop();//inherited method 
		b.refuel();//inherited method
		b.start();//overridden method
		b.autopark();//individual method or independent method of BMW
		BMW.getName();
		b.engine();
		
		System.out.println(b.speed); //variables can not be over ridden
		Car c=new Car();
		c.start();//parent can not take anything from child class
		c.stop();
		//c.autopark();//parent can not take anything from class
		//Top casting:
		//child class object can be referred by parent class ref variable is allowed in java
		//.can we access BMW autopark method by using car ref var.we cant access child class method by using car class ref var .JVM will check ref variable and object type if not matching jvm will not to access child class methods
		//ref type check 
		Car c1=new BMW(); //every BMW is a car
		c1.stop();
		c1.start();
		//c1.autopark();
		c1.refuel();
		Car.getName();
		//b.getName();
		
		Audi a=new Audi();
		a.stop();
		a.start();
		a.refuel();
		a.childlock();
		
		//BMW b2=new Audi();
		
		
		
		//down casting : parent class object can be referred by child class ref variable/
		
		//BMW b1=(BMW)new Car();//Every car is not a BMW
		//at compile time it wont allow and forcefully we can convert into maruti to BMS (but engine is maruti only)but we cant use at run time thats why java is giving class cast exception 
		
		//Top Casting
		//child class object can be referred by grand parent reference variable 
		
		Vehicle v1=new BMW();
		v1.engine();
		
		//v1.start(); it wont allow to access child class methods 
		
		//down casting : parent class object can be referred by child class ref variable
		//BMW b2=new Vehicle(); //at compile time it wont allow and forcefully we can convert into maruti to BMS (but engine is maruti only)but we cant use at run time thats why java is giving class cast exception 
		
		
		
		
	}
	
	
	
	

}
