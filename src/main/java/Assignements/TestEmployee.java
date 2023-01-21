package Assignements;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsualationEmployee e1=new EncapsualationEmployee();
		e1.setName("jai");
		e1.setAge(22);
		e1.setGender('M');
		e1.setIsactive(true);
		e1.setSalary(50000);
		e1.employeeInfo(e1.getName(),e1.getAge(),e1.getGender(),e1.getIsactive(),e1.getSalary());
		

		EncapsualationEmployee e2=new EncapsualationEmployee();
		e2.setName("sam");
		e2.setAge(32);
		e2.setGender('F');
		e2.setIsactive(true);
		e2.setSalary(20000);
		e2.employeeInfo(e2.getName(),e2.getAge(),e2.getGender(),e2.getIsactive(),e2.getSalary());

		EncapsualationEmployee e3=new EncapsualationEmployee();
		e3.setName("reddy");
		e3.setAge(24);
		e3.setGender('F');
		e3.setIsactive(false);
		e3.setSalary(30000);
		e3.employeeInfo(e3.getName(),e3.getAge(),e3.getGender(),e3.getIsactive(),e3.getSalary());
		
	}

	
}
