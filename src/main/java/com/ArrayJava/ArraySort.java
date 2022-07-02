package com.ArrayJava;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int a[]= {10,1,20,38,4,89,90,100,};
		
		for(int i=0;i<a.length;i++)
		{System.out.print(+a[i]+" ");//before sorting
			}
		System.out.println();//this is for go to next line
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		//System.out.println();
	}
	
	}
