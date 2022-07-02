package com.ArrayJava;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDescending {

	public static void main(String[] args) {
		int a[]= {20,60,40,90,30,50,100,80,70,10};
		
System.out.println("As Array  :" +Arrays.toString(a));
//#1
Arrays.sort(a);
System.out.println("After sorting1 : "+Arrays.toString(a));

//#2
Arrays.parallelSort(a);
System.out.println("After sorting2 : "+Arrays.toString(a));
	
//#3Reversed Descending order

Integer b[]= {60,40,35,65,90,30,50,100,80,70,10};
Arrays.sort(b,Collections.reverseOrder());;
System.out.println("After sorting3 : "+Arrays.toString(b));





	
	}

}
