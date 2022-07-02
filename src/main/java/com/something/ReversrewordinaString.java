package com.something;

public class ReversrewordinaString {

	public static void main(String[] args) {
		
		
		
		
		
		
	/*	//1--reverse word by algorithem
		String str = "wellcome to java world";//input
		 String[] words= str.split(" ");//split  in 4 word(\\s)
		 String reversedstring = "";
		 
		 for(String w:words) {
			 
			 String reversedword = "";
			 
			 for(int i=w.length()-1;i>=0;i--)
			 {
				
				 reversedword = reversedword+w.charAt(i);
				 }				 
			 
			 reversedstring=reversedstring+reversedword +" ";				 
		 }
		System.out.println(reversedstring); */
		
		
		
		
		
		//2-- By reverse method--
		
		 String str="wellcome to java world";
		String[] words=str.split("\\s");
		
		String reversedword="";
		
		for(String w: words)
		{
		StringBuilder sb= new StringBuilder(w);
		sb.reverse();
		
		reversedword=reversedword+sb.toString()+" ";
		}
		System.out.println(reversedword);
		  
		

		
		
		
		
	}

}
