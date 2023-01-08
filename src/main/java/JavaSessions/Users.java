package JavaSessions;

public class Users {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Users u1=new Users();
		u1.name="sam";
		u1.age=38;
		u1.city="hyd";
		
		Users u2=new Users();
		u2.name="john";
		u2.age=39;
		u2.city="banglr";
		
		Users u3=new Users();
		u3.name="sagar";
		u3.age=40;
		u3.city="pune";
		System.out.println(u1.name  + " " +u1.age + " " +u1.city);
		System.out.println(u2.name  + " " +u2.age + " " +u2.city);
		System.out.println(u3.name  + " " +u3.age + " " +u3.city);
		
	//important interview question
		
		u1=u2;
		System.out.println(u1.name  + " " +u1.age + " " +u1.city);
		System.out.println(u2.name  + " " +u2.age + " " +u2.city);
		System.out.println(u3.name  + " " +u3.age + " " +u3.city);
		
		System.out.println("********************");
		
		u2=u3;
		System.out.println(u1.name  + " " +u1.age + " " +u1.city);
		System.out.println(u2.name  + " " +u2.age + " " +u2.city);
		System.out.println(u3.name  + " " +u3.age + " " +u3.city);
		
		System.out.println("**************");
		
		u3=u1;
		System.out.println(u1.name  + " " +u1.age + " " +u1.city);
		System.out.println(u2.name  + " " +u2.age + " " +u2.city);
		System.out.println(u3.name  + " " +u3.age + " " +u3.city);
		
		//no reference objects
		
		new Employee().name="Lisa";
		new Employee().name="satya";
		
		//null reference objects
		Employee e5=new Employee();
		e5=null;
		System.out.println(e5.name);//null pointer exception
		System.gc();//will try to destroy 3 object 
}
}