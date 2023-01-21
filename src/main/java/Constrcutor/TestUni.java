package Constrcutor;

import java.util.ArrayList;

public class TestUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> delhiuni=new ArrayList<String>();
		delhiuni.add("physics");
		delhiuni.add("chemistry");
		delhiuni.add("science");

		University uni=new University("delhi", "new delhi",delhiuni);
		System.out.println(uni.getHq());
		System.out.println(uni.getCourselist());
		System.out.println(uni.getName()+ " " +uni.getHq());
		uni.setHq("pune");
		System.out.println(uni.getHq());
		System.out.println(uni.getName()+ " " +uni.getHq());
	}

}
