package com.something;

public class HelloBizBee2 {

	public static void main(String[] args) {
		

		String input="1234";
		String output="";
		
			
		
		for ( int i=input.length()-1;i>=0;i-- ) 
		{
			
		output = output +input.charAt(0);
		System.out.println(output);
		}
		
		
	}

}
