package OOPS_AbstractConcept;

public class TestPage {
	public static void main(String[] args){
		
		
		
		LoginPage lp=new LoginPage(10);
		lp.title();
		lp.header();
		lp.timeOut();
		lp.logo();//page class method
		Page.getUrl();//static method
		
		//top casting
		//Page p=new LoginPage();
		//p.doLogin(); we can not access because individual methods are not allowed in top casting
	//	p.title();
	//	p.header();
	//	LoginPage lp1=new Page(); not allowed
		
		
	}

}
