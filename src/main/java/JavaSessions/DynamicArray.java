package JavaSessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//ArrayList ----default class
		//size is not fixed
		//index based ----maintains the order
		//create the object of the arrayList class
		//default size is 10 segments vc=10(virtual capacity)
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());//physical capacity is zero ar.size will always work on physical capacity 
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		//System.out.println(ar.size());//3
		
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());//PC=5
		ar.add(600);
		ar.add(700);
		System.out.println(ar.size());
		//remove value from arraylist
		ar.remove(3);
		System.out.println(ar.get(3));
		System.out.println(ar.size());
		
		
		//to print all the values from arralist:for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			System.out.println("****************");
			
			
			//for each loop
			for(Object e :ar) {
				System.out.println(e);
			}
			//Generics in java
			       
			ArrayList<String> emplist=new ArrayList<String>();
			emplist.add("tom");
			emplist.add("sam");
			ArrayList<Integer> emplist1=new ArrayList<Integer>();
			emplist1.add(100);
			
			//AR----empdata--->string, int,double,true,char
			
			ArrayList<Object> empdata=new ArrayList<Object>();
			empdata.add("john");
			empdata.add(20);
			empdata.add(22000.897);
			empdata.add("true");
			empdata.add('F');
			System.out.println(empdata);//we can directly call the values of variable in arraylist 
			for(Object e: empdata)
			{
				System.out.println(e);
			}
			
			for (int j=0;j<empdata.size();j++) {
				System.out.println(empdata.get(j));
				if(empdata.get(j).equals("john"))
						{
					System.out.println("emp name is john");
					
					break;
					
					
					//use cases in selenim
					//1.10 links on the page
					//collect all 10 links in an arraylist
					//start a loop.
					//if(ele.text().equals('amazon')
					//click();
					//break;
					//drop down selection
					//20 elements are there
					//collect all 20 values from arraylist
					//start a loop
					//if(ele.text().equals('india')
					//select the value
					//break the value 
					
					
				}
			
				ArrayList<String> studentnames = new ArrayList<String>();
				
				studentnames.add("Tom");
				studentnames.add("arpita");
				studentnames.add("120");
				
			}
			ArrayList<String> product=new ArrayList<String>();
			product.add("macbook");
			product.add("samsung");
			System.out.println(product.get(0));
			System.out.println(product.get(1));
			System.out.println(product.get(2));//index out of bounds exception
			
			//memory in the form of segments on our  ram 
			
			
			
			
			
	}

}
}