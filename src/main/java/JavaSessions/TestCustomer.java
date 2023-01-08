package JavaSessions;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i=10;
		System.out.println(i);
		
		int salary =1000;
		final int days=7;
		int totalamount=salary*days;
		System.out.println(totalamount);

		
		Customer c1=new Customer();
		c1.name="Tom";
		c1.emailid="test@verizon.com";
		c1.phone=878786876;
		c1.isprime=true;
		System.out.println(c1.name);
		System.out.println(Customer.category);
		
		//Customer.category="sports";
		//System.out.println(Customer.category );//we can not reassign this property values 
		
		//final values are always fixed we never change this value.to provide the constant values 
		//final keyword is used when the data is always constant 
		
		
		
		
		
	}

}
