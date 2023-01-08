package Constrcutor;

public class Employee {

	//constructor...is having the same name as class name
	
	//const-...does not have any return type 
	//const is not a function it will never return anything
	//function may or may not return 
	//const can be overloaded
	//const can be called when u create the object of the class
	//const will be called by the JVM
	//when we want to create the  specific object we have to pass the values 
	//const will behave like a setter
	//const will help to create the type of object ,with const to avoid creating of unnecessary objects
	//business logic/feature should be defined inside the functions
	//cont will be helping to set the values//like setter
	//we can omit the setter
	
	public  Employee() { //default const
			System.out.println("default const");
	}

	public  Employee(int a) { //1 paramater
			
		System.out.println("1 param cont");
	}
	

	public  Employee(int a,String b) { //2 paramater
		
		
	System.out.println("2 param const");
		
	}
	
	public static void main(String args[]) {
		Employee e1=new Employee();
		
		Employee e2=new Employee(10);
		Employee e3=new Employee(20,"Tom");
		//Employee e4=new Employee(10,30);
	}
}
