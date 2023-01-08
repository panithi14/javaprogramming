package JavaSessions;

public class MethodsInJava {

	//Methods//Functions :logic is written in a block
	//you can call this block
	//static/non static method
	//can not a create a method inside a method
	//but we can call methods from different methods
	//duplicate methods are not allowed 
	//but we can overload the methods 
	//methods should be independent each other
	//to call the non static methods we have to create the object of the class
	//the function can not return multiple values
	//the function can return only one value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsInJava obj=new MethodsInJava();
		obj.test(); //calling the method here
		int c=obj.add();
		String s=obj.getTrainername();
		System.out.println(s);
		int s2=obj.add(10,50);
		System.out.println(s2);
		
	}
	
	
		//1.no input and no return 
		//void does not return anything
		public void test() {
			System.out.println("test method");
		}
			
		//2.no input but some return
		//return type:int 
		public int add() {
				System.out.println("sum method");
				int a =20;
				int b =30;
				int z=a+b;
				return z;
		}
				//here void and return can not be together if the function with void it should not be return 
				
				
				public String getTrainername() {
					System.out.println("get trainer name");
					
					String name="naveen";
					return name;
					
				}
				
			//3.some input some return 
				public int  add(int a ,int b) {
					
				System.out.println("add method");
				int sum =a+b;
			return sum;
			//return a;
			
			//two returns can not be allowed 
			//and return should be end of the method
			
					
			}
				
				
			
		
	}

