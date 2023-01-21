package OOP_Interface;

public interface USMedical extends WHO{
	
	int min_fee=100;
	//variables are static and final by default
	
	//we can not create the object of the interface
	//abstract method ...a method which does not have any method body is called abstract methods
	//prototype method...only declaration...no method body
	public void physioServices();
	public void detalServices();
	public void oncologyServices();
	public void dermaServices();
	public void emergencyServices();
	
	//after JDK 8:
	//1.can have static method with body
	public static void medicalEquipment() {
		System.out.println("US....medical Equipment");
	}
	
	//can have default method with method body
	///default method can not be final and static and it can be overridden
	default void medicalCertificate() {
		System.out.println("US.....medicalCertificate");
	}
}
