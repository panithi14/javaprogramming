package OOPS_AbstractConcept;

public abstract class Page {
	
	public Page() {
		System.out.println("page...default constrct");
	}
	
	public Page(int a) {
		System.out.println("page ...1 param");
	}
	
	//abstract class can have zero abstract methods:0% abstraction
	//abst can have only abstract methods :100% abstraction
	//abstract class can have abstract +non abstract methods also :partial abstraction
	//we can not create object for abstract class 
	//we can create constrcutor of  abstract class
	//but we can call the constr when we create the object of child class
	
	
	public abstract void title();
	public abstract void header();
	
	public void timeOut() {
		System.out.println("page...timeOut is 5 sec");
	}
	
	public final void  logo() {
		System.out.println("page ...logo");
	}
	
	public static void getUrl() {
		System.out.println("www.google.com");
	}
}
