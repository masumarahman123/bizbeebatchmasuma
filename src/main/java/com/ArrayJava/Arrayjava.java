package com.ArrayJava;

import java.util.Arrays;

public class Arrayjava {
	public static void main(String[] args) {
		// if you want store many value in single variable it is possible in array
		//array is set of elements which rae sama data types
		//declaration of array for fixed length
		//single dimentional array
		//homo lineousdata elements
		//so length is fixed and one data type can hold
	/*	int[] sale = new int[5];//allocate 5 different location for 5 elements
		//evey element able to recognized based on the index value
         //how to storey an array
		sale[0]=100;//index theory //sale[0]--array name of index number
         sale[1]=150;//referance type variable
         sale[2]=50;//object type variable
         sale[3]=40;
   		 sale[4]=100;
   		/* System.out.println(sale[0]);
   		System.out.println(sale[1]);
   		System.out.println(sale[2]);
   		System.out.println(sale[3]);
   		System.out.println(sale[4]);
   		or  System.out.println(sale.length);
   		*/
   	/*	Arrays.sort(sale);
   		 System.out.println("Sorting array:"+Arrays.toString(sale));
   		 //or by for loop
   		 //read elenemts of array
   		
		for(int i=0;i<5;i++) {
			System.out.println("Read elements of array:"+sale[i]);
		}
		 
   		
   		 
   		 //by for --each loop
   		 
   		 for(int i:sale) {
   			 System.out.println("For eatch loop assending:"+i);
   		 }*/
   		
   		   //for Dynamic array where length is not fixed
   		 
   		 
   		/* int[] sale = {100,150,50,40,100};
   		 
   		 for(int i:sale){
   		 	System.out.println(i);
   		 }*/
   		
   		 
   	/*	// for sum
   		 
   		int sum1=0;
   		for(int i=0;i<5;i++) {
   			
   			sum1=sum1+sale[i];
   		}
   		System.out.println("sum1 is--"+sum1);
   		 
   		/*int sum=0;//declare a container/variable in order to hold   sumation
   		for(int i=0;i<sale.length;i++) {
   			
   			sum=sum+sale[i];
			
		}
   		System.out.println(sum);*/
   		
 /*  //find the total of sale		
   		int sum=0;
   		for(int i=0;i<sale.length;i++) {
   			//int sum=0;
   			sum=sum+sale[i];
   			//System.out.println(sum);	
		}
   		System.out.println("Total is:"+sum);
   	//for ave total%length
   			System.out.println("The ave is:"+sum/sale.length);
   		
   		///printout each value of array and pri  
   		
   		/*int sum=0;
   		for(int i=0;i<sale.length;i++) {
   			
   			sum=sum+sale[i];
   			System.out.println(sale[i]);	
		}
   		System.out.println(sum);*/
   		
		
		
		String [] name=new String[4];
		 
		 name[0]="eva";
		 name[1]="masuma";
		 name[2]="mane";
		 name[3]="saif";
				
	for(int i=0; i<name.length; i++) {
				
	for(int j=0;j<name.length;j++) {
	if(name[i].toString().charAt(j)=='a') {	
		System.out.println("char[j]");		}	
	
				  }
	}
				//find max no.
				
   		//do assending array
   		/*for(int i=0;i<sale.length;i++) {
  	
   		
   			System.out.println(sale[i]+" ");	
		}
   		
   			*/
   	/*	//max
   		 int max=0;
   		for(int i=0;i<sale.length;i++) {
   		  	
   	   		if(sale[i]>max) {
   	   			max=sale[i];
   	   		}
	
		}
   		
   		System.out.println( "Max sale is: "+max);
   		
   		
   		
   		
   		//min
   	 int min=sale[0];
		for(int i=1;i<sale.length;i++) {
		  	
	   		if(min>sale[i]) {
	   			min=sale[i];
	   		}
	
		}
		
		System.out.println("Min sale is :"+min);  
		
		
		System.out.println();
		Arrays.sort(sale);
	for(int i=0;i<sale.length;i++) {
	System.out.println(sale[i]);	
	}*/
	
	
		
	}

}
