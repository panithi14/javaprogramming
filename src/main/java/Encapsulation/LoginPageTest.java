package Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.first user
		LoginPage obj=new LoginPage();
		obj.setUsernname("admin");
		obj.setPassword("admin@124");
		//System.out.println(obj.getPassword());
		//System.out.println(obj.getUsernname());
		obj.doLogin(obj.getUsernname(),obj.getPassword());
		
		
		//2nd user
		LoginPage obj1=new LoginPage();
		obj1.setUsernname("sam");
		obj1.setPassword("sam@1457");
		obj1.doLogin(obj1.getUsernname(),obj1.getPassword());
		
		//3rd user
		
		obj.setPassword("jaisam");
		obj.doLogin(obj.getUsernname(),obj.getPassword());
	}

}
