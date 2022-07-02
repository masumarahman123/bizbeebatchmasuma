package com.something;

public class ReversedwWord {

	public static void main(String[] args) {
		  
	//1st process using concatenation operation
	  
	 	String str ="Milestone";
		String rev ="";
		
	 int len=str.length();
		for(int i=str.length()-1;i>=0;i--) //str.length()-1=len-1;
		{
			rev=rev+str.charAt(i);
		}
System.out.println("Reversed word is:"+rev);
		
	//2nd process using character array
		
	/*String str=" Good"	;
	String rev = "";
	char[] a= str.toCharArray();
	
	int len=a.length;
	for( int i=len-1;i>=0;i--)
	{
		rev=rev+a[i];
	}
	System.out.println(rev);*/
		
		
/**/
	}
}
