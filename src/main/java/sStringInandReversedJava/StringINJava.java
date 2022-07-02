package sStringInandReversedJava;

public class StringINJava {

	public static void main(String[] args) {
	//String =data type/but also it is  a class in java	
	//this the reson string is non-premitive data type	
	 String name ="jameel";
	 String obj=new String("jameel");//line no. 8 and 9 same thing
	 
	 //since it is a class so it has method
	 //so we can call it by objcet name
	 obj.charAt(2);//it will return like length method
	 System.out.println(obj.charAt(2));
	 System.out.println(obj.charAt(4));
	 
	 String country="United State of America is a big country";
	
	 String[] pcs=country.split(" ");//split/cut string 
	 System.out.println("Split no.:" +pcs.length);//breaks word
	 
	 String repl=country.replaceAll(" ", "");//
	 System.out.println("country is rep:"+repl.length());//len without white space
	 
	 
	 System.out.println(country.length());//length
	 System.out.println(country.toUpperCase());//upper case
	 
	 
	 String low=country.toLowerCase();
	 System.out.println(country.toLowerCase());//lower case
	 //or
	 System.out.println(low);
	
	 
	 
	 
	 
	 //count how many 'a'
	 //
	 int count=0;	 
	 for(int i=0;i<country.length();i++) {
		 
		if(country.charAt(i)=='a') {
			
			count++;//count=count+1;
		}
		
	 }
	 
	 System.out.println("Given Sentence : "+count);
	 //convert after lower case
	 int count1=0;
	 for(int i=0;i<low.length();i++) {
		 if(low.charAt(i)=='a') {count1++;
	 }
	 }
	 System.out.println("After lower case :"+count1);
	
	//if I write count+1 --count+i 
	//find place no. of 'a'
	 int count2=0;
	 for(int i=0;i<low.length();i++) {
		 if(low.charAt(i)=='a') {
			 count2=count2+i;
			 System.out.println("The place of a is :"+count2);
		 }
		 
			 }
	String love = "I love java.I love it so much";	 
	System.out.println(love);
	
	
	String rep= love.replaceAll("love"," hate");
	System.out.println(rep);
	}
	
}
