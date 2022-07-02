package com.ArrayJava;

public class Arrayobject {

	public static void main(String[] args) {
		
	
	/*	requirements :
			int, double, float,bolean,character
			we want to store in an array
			 using object class which is pre built class
	
	*One dimentional array
	*int a[]=new int[5];
	*Has only row
	*Two domentional array/
	*int a[][] = new int[3][2];
	*Has row and column
	*/
		
		
		Object s[]=new Object[5];//limit length
		s[0]=10;
		s[1]=12.5;
		s[2]="wellcome";
		s[3]='f';
		s[4]=true;
		
		for(Object i:s) {

		System.out.println(i);}
		
		//unlimited
		//Object s[]={ 34,12.34,"hello",true,'f',100,55,"asd"};
	}

}
