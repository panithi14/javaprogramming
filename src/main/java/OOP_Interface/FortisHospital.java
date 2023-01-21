package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical ,UKMedical, IndianMedical{

	//US
	
	@Override
	public void physioServices() {
		System.out.println("physio services");
		
	}

	@Override
	public void detalServices() {
		System.out.println("dental services");
		
	}
	
	@Override
	public void dermaServices() {
		System.out.println("derma services");
	}

	@Override
	public void oncologyServices() {
		System.out.println("oncology services");
		
	}
	
	//UK

	@Override
	public void cardioServices() {
		System.out.println("cardio services");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("pedia services");
		
	}
	
	//India

	@Override
	public void neuroServices() {
		System.out.println("neuro services");
	}

	@Override
	public void orthoServices() {
		System.out.println("ortho services");
		
	}

	@Override
	public void entServices() {
		
		System.out.println("enta services");
		
	}
	@Override
	public void emergencyServices() {
		System.out.println("FH .....emergency services");
		
	}
	
	
	//Individual methods
	public void medicalInsurance() {
		System.out.println("medical insurance");
	}

	public void medicalTraining() {
		System.out.println("medical training");
	}
	
	@Override
	public void helpDesk() {
		System.out.println("FH....help desk");
	}

	//WHO
	@Override
	public void covid19Test() {
		System.out.println("covid 19 test");
		
	}

	//method hiding 
	//public static void medicalEquipment() {
	//System.out.println("US....medical Equipment");}


@Override
    public void medicalCertificate() {
	System.out.println("US.....medicalCertificate");
}
}