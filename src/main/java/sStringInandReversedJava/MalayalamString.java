package sStringInandReversedJava;

public class MalayalamString {

	public static void main(String[] args) {
		
		
		String s="United State  Of America";		
		String wsp=s.replaceAll(" ", "");
		System.out.println(s);
		System.out.println(wsp);
		System.out.println("No.Of Charecter :"+s.length());
		System.out.println("No.Of Alphabet :"+wsp.length());
	StringBuilder sb=new StringBuilder(s);
	String rev=sb.reverse().toString();
	System.out.println(rev);
		
	if(s.equalsIgnoreCase(rev))
	{
		System.out.println("I am pallindrome");
	}	
	else {System.out.println("For s::"+"I am not");}
		
	String s1="konok";
	String rev1=sb.reverse().toString();
	
	if(s1.equalsIgnoreCase(rev1)) 
	{System.out.println("I am Mallayalam");}
	else {System.out.println("For s1::"+"Not Mallayalam");}
	}

	}	
		
		
