package Encapsulation;

public class LoginPage {
	
	private String usernname;
	private String password;
	public String getUsernname() {
		return usernname;
	}
	public void setUsernname(String usernname) {
		this.usernname = usernname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void doLogin(String un ,String pwd) {
		System.out.println(un + ":" +pwd);
	}
}
