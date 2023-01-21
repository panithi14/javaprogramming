package JavaSessions;

public class Employee {
    //class is blueprint or template  of all the objects for all the same category
 	
	//class is a concept 
	//every object is having own property 
	
	//class vars://it means global variable we can access anywhere in the project 
	String name; //will be common for all the objects ,but their values will be different
	int age;
	double salary;
	boolean isActive;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//create the object:use new keyword 
		Employee e1=new Employee();//RHS is object
	//object is new Employee here e1 is object reference variable 
		System.out.println(e1.name);
		//default value of name is null
	
		System.out.println(e1.age);//0
		System.out.println(e1.salary);//0.0
		System.out.println(e1.isActive);//false
		
		//local variable can not be part of the object
		
		Employee e2=new Employee();
		e2.name="naveen";
		e2.isActive=false;
		System.out.println(e2.name+ " "+" " + e2.isActive+ "");
	

	
	//create object without reference
	//new Employee().name="Lisa";
	//new Employee().age="21";
	//new Employee().salary="2090889";
		
		
	
}
}