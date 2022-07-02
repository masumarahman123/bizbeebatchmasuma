package sStringInandReversedJava;

public class ReversedStringClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String reversed number
		
		int num=1234567;
		
		StringBuffer obj=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev3=obj.reverse();
		System.out.println("The num is :"+rev3);
	
	
	//string bilder class
		
		StringBuilder obj1=new StringBuilder();//no argument
		obj1.append(num);//this is a method of  StringBuilder class 
		
		 StringBuilder rev4=obj1.reverse();
		
		 System.out.println(" StringBuilder reversed no. is :"+rev4);
		
		
		
	}

}
