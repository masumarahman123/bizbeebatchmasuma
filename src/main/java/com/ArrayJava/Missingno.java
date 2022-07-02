package com.ArrayJava;

public class Missingno {
// Array should not have duplicate
	//no need sorted
	//value in range
	//1+2+4=7//1+2+4+7=14
	public static void main(String[] args) {
		
	int x[]= {1,2,4,7,9};	
		
	int sum1=0;
	for(int i=0;i<x.length;i++) {
		 sum1=sum1+x[i];
	    }
	System.out.println(sum1);
	}
	

}
