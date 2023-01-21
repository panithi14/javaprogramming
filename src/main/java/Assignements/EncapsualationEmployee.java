package Assignements;

public class EncapsualationEmployee {
	private String name;
	private int age;
	private char gender;
	private boolean isactive;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	 public void employeeInfo(String name,int age,char c,boolean b,double d) {
		 System.out.println(name + ":" +age + ":" +c + ":" +b +":" +d);
	 }
	
	

}
