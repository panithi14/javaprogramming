package JavaSessions;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int i=10;
		i=20;
		i=30;
		System.out.println(i);*/
		//int array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
	//	i[-1]=60;//java.lang.ArrayIndexOutOfBoundsException -run time
	//	i[4]=50;//java.lang.ArrayIndexOutOfBoundsException -run time
		System.out.println("Li = "+ 0);
        System.out.println("length = " +i.length);
        int l=i.length;
        System.out.println("Hi = " +(l-1));
      //  System.out.println(i[4]);//java.lang.ArrayIndexOutOfBoundsException -runtime
       // System.out.println(i[4]);
       // System.out.println(i[-1]);
        System.out.println("*************");
        
        //to print all the values from array:for loop
        for(int k=0;k<i.length;k++)
        {
        	System.out.println(i[k]);
        }
        
        System.out.println("*************");
        
        //for each loop //O(n)...linear
        for(int e :i) {
        	System.out.println(e);
        	
        }
      //Double array
    	
    	double d[]=new double[2];
    	d[0]=12.33;
    	d[1]=100;
    	for(int j=0;j<d.length;j++) {
    		System.out.println(d[j]);
    		
    		//for each for double
    		for(double e :d) {
    			System.out.println(e);
    			
    			//char array
    			char c[]= new char[2];
    			c[0]='b';
    			c[1]='z';
    			//String array
    			String names[]=new String[3];
    			names[0]="sam";
    			names[1]="jai";
    			names[2]="mohan";
    			for(int k=0;k<names.length;k++) {
    				System.out.println(names[k]);
    				}
    			//for each for string array
    			for(String s :names) {
    				System.out.println(s);
    			}
    	}
    		
    		//5.Emp data:name,age,salary,gender,isperminent
    		//object static array
    		//object is a parent class of all the classes in java
    		
    		Object empdata[]=new Object[5];
    		empdata[0]="Lisa";
    		empdata[1]="30";
    		empdata[2]="F";
    		empdata[3]="34.55";
    		empdata[4]="true";
    		
    		//to print all the emp data values
    		for(int q=0;q<empdata.length;q++)
    		{
    			System.out.println(q+ "=" + empdata[q]);
    		}
    		
    		System.out.println("********************");
    		
    		int count =0;
    		
    		for(Object e :empdata) {
    			System.out.println(count + "=" + e);
    			count++;
    			
    		}
        
        int price[]=new int[100];
        price[0]=10;
        price[2]=20;
        System.out.println(price[0]);
        
    	}
	}

}
