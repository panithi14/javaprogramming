package Encapsulation;

public class LaunchBrowser {

	
	public void launchBrowser()
	{
		System.out.println("launch browser");
		checkRam();
		osCompatable();
		checkStorage();
		System.out.println("chrome is launched");
		
		
	}
	private void checkRam()
	{
		System.out.println("check ram ");
	}
	private void osCompatable() {
		System.out.println("os compatable");
	}
	private void checkStorage() {
		System.out.println("check storage");
	}

}

