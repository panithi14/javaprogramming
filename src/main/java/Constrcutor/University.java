package Constrcutor;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	private String name;
	private String hq;
	private ArrayList<String> courselist;
	public University(String name, String hq, ArrayList<String> courselist) {
		super();
		this.name = name;
		this.hq = hq;
		this.courselist = courselist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHq() {
		return hq;
	}
	public void setHq(String hq) {
		this.hq = hq;
	}
	public List<String> getCourselist() {
		return courselist;
	}
	public void setCourselist(ArrayList<String> courselist) {
		this.courselist = courselist;
	}
	

}
