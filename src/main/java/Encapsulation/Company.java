package Encapsulation;

public class Company {
	private String name;
	private int empcount;
	private String hq;
	public String ceoName;
	
	public String getcompanyinfo() { //getter of getting all the company information
		String info=name+empcount+hq;
		return info;
		
	}
	//setter and getter :these are public in nature 
	
	public void setName(String name)
	{
		this.name=name;//this.class variable =local variable,by using this we can only access class variable.we can not
		//setter and getter both are always public in nature 
	}
	
	public String getName() {
		return name;
		
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company obj =new Company();
		obj.name="IBM";
		obj.empcount=1000;
		obj.hq="bnaglr";
		System.out.println(obj.name);
	}*/

}
