package JavaSessions;

public class Car {
	
	String name;
	int price;
	String colour;
	static int wheels =4; //common property

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object will never hold any static property
		Car c1=new Car();
		c1.name="BMW";
		c1.price=80;
		c1.colour="blue";
		
		Car c2=new Car();
		c2.name="Honda";
		c2.price=100;
		c2.colour="white";
		
		Car c3=new Car();
		c3.name="shift";
		c3.price=80;
		c3.colour="black";
		
		//static variable should be hold on common memory area means metaspace(perminent generatation)in jdk 1.8
		System.out.println(c1.name + " " +c1.price + " " +c1.colour + " " +Car.wheels );
		System.out.println(c1.wheels);//wrong way 
		
		//static var can be access directly without class name;
		System.out.println(wheels);
		
	}

}
