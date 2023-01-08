package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fs=new FortisHospital();
		fs.orthoServices();
		fs.emergencyServices();
		fs.medicalTraining();
		
		//USMedical us=new USMedical(); we can not create object for the interface
		
		//top casting:child class object can be referred by parent interface ref variable
		
		USMedical us=new FortisHospital();
		us.detalServices();
		us.oncologyServices();
		us.physioServices();
		us.emergencyServices();
		System.out.println(USMedical.min_fee);
		USMedical.medicalEquipment();
		fs.medicalCertificate();
		
		//down casting is not available in interface ....NA
		
		
		fs.helpDesk();
		fs.billing();
		fs.covid19Test();
		fs.pandamicAnnouncement();
		//static is common memory allocation 
		//final is to prevent the method over riding


	}

}
