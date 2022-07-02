package com.ArrayJava;

public class String2m {

	public static void main(String[] args) {
		 //1. findin the length()
		  
		 //2.concate() string--join 2 string
		  //3.equal()--2 string equal or not
		  //4.equalsignorCase()
		  //5.contains()
		  //6.substring()
		  //replace()

		
		String s= "welcome";
		
		//find length
		System.out.println("length is: "+s.length());
	
	
	//2.concation to string
		
		String s2="welcome to";
		
		String s3="our home";
		System.out.println("result is : "+s2+s3);
		System.out.println("Result 2 is  :"  + s2.concat(s3));
		
		System.out.println("wellcome to"+"our home");
	    System.out.println("wellcome to".concat("our home"));
	
	//equals=true or false//comparing two string
	    
	    String s4="WELLCOME";
	    String s5="wellcome";
	    
	    System.out.println("It is equal: "+s4.equals(s5));
	    //equalIgnoreCase--compare the string (ignor case sensitivity)
	    System.out.println("Ti is equalIgnore :"+s4.equalsIgnoreCase(s5));
	
	    //contains()//true/false--cheek a string contains another string
	
	   System.out.println( s4.contains("IT is contains:"+"acw"));
	  
	   //substring (starting index =0, ending index 1)
	   /*extracting substring from main string
	    	0  1 2 3 4 5 6 
	   		W  E L C O M E
	   		1  2 3 4 5 6 7
	   (0,3)--wel
	   (2,5)--lCO*/
	   
	   System.out.println("substring is :"+s.substring(4, 7));
	    
	   //repalce --replacing character/ strings with in a string
	   System.out.println("replace is :"+s.replace('e','a'));
	    
	}

}
