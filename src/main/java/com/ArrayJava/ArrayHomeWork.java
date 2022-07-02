package com.ArrayJava;

import java.util.Arrays;

public class ArrayHomeWork {

	public static void main(String[] args) {
		
	int sale[]= {6,9,7,10,11,9,7,12,14,15,13,11};
	//String month[]= {"jan","feb","mar","april","may","june","july","aug","sep","oct","nov","dec"};
	//Totalsale
	int totalsale=0;
	for(int i=0;i<sale.length;i++) {
		
		totalsale=totalsale+sale[i];
		
	}
	System.out.println("total is "+totalsale);
	//for ave of the months
	
	double ave=(double)totalsale/sale.length;
	System.out.println("The ave is "+ave);
	
	//For max//find the highest sale of the months
	int max =sale[0];
	for(int i=0;i<sale.length;i++) {
		if(sale[i]>max)
	max	=sale[i];
		
	}
	System.out.println("The max sale:" +max);
	
	//for min sale of the months
	
	int min =sale[0];
	for(int i=0;i<sale.length;i++) {
		if(sale[i]<min) {
	min	=sale[i];
		
	}
	}
	System.out.println("The min sale:" +min);
	
	
	
	//which months has more than ave
	
	for(int i=0;i<sale.length;i++) {
		if(sale[i]>ave) {
		System.out.println("Which months has more then ave sale :"+ sale[i]);	
		
	}
			
	}
	//find /do shorting 
	
	Arrays.sort(sale);
	System.out.println("Sorting by no." +Arrays.toString(sale));

	//
	
	}
	}
