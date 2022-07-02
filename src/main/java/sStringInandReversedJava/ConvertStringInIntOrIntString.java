package sStringInandReversedJava;

public class ConvertStringInIntOrIntString {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//convert  int into String
		String p =String.valueOf(a);
		String q=String.valueOf(b);
		System.out.println("The String is::"+a+b);
		
		//duoble into String
		double r=10.25;
		String h=String.valueOf(r);
		System.out.println(h);
		
		String k="10.2345";
		double k1=Double.parseDouble(k);
		System.out.println(k1);
		/*not possible	
String x="Saif";
String y="Luna";	
	  int s=Integer.parseInt(y);
	int t=Integer.parseInt(x);
	System.out.println(s+t);
	//int s1=String.valueOf(x);
	//int t1=String.valueOf(y);*/

}}
