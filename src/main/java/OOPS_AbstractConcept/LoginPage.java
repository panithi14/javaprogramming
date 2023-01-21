package OOPS_AbstractConcept;

public class LoginPage extends Page{
	
	//public LoginPage() {
		//System.out.println("LP...default constrct");
	//}
	
	public LoginPage(int a) {
		System.out.println("LP ...1 param");
	}

	@Override
	public void title() {
		System.out.println("LoginPage....title");
		
	}

	@Override
	public void header() {
	System.out.println("LoginPage....header");
		
	}
	
	public void doLogin() {
		System.out.println("LP...do login");
	}

	@Override
	public void timeOut() {
		System.out.println("page...timeOut is 20sec");
	
}
}