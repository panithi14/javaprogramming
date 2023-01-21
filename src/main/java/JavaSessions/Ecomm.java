package JavaSessions;

public class Ecomm {
   //duplicate methods are not allowed 
	//method overloading:
	//within the same class when we have diff methods:
	//1.with the same name
	//2.with different types of parameters
	//3.the sequence of the paras should be different.
	
	
	/*public void login() {
		System.out.println("login");
	}
	public void login(int a) {
		System.out.println("login" +a);
		
	}
	public void login(int a, int b) {
		System.out.println("login" +a+b);
	}
	public void login(String a, int b) {
		System.out.println("login" + a+b);
	}
	public void login(int a,String b)
	{
		System.out.println("login" + a+b);
	}
	*/
	//practical example in interview
	
	public void login() {
		System.out.println("default login");
	}

	public void login(String Un, String pwd)
	{
		System.out.println("login with" + Un + pwd);
	}
	public void login(String Un, String pwd, String role)
	{
		System.out.println("login with" + Un + pwd +role);
	}
	
	public void login(String Un, String pwd ,int otp)//parameters 
	{
		System.out.println("login with" + Un + pwd + otp);
	}
	
	
	public void search() {
		System.out.println("default search");
	}
	public void search (String name)
	{
		System.out.println("search with product name");
	}
	
	public void search(String name,String sellername) {
		
	}
	
	//car booking 
	//payement methods these are all method overloading example
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//compile (static)early polymorphism ....>different forms 
		
		Ecomm obj=new Ecomm();
		obj.login("admin","admin212");//arguments
		
		
	}

}
