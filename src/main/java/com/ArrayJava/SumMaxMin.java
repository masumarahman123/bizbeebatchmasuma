package com.ArrayJava;

public class SumMaxMin {

	public static void main(String[] args) {
		//we can store any no of elements
		//how to decalare array
		//how to read elements from array
		//how to store value without limit
		
		int a[]= {1, 100,5,20,100,30,15};
		 
		int sum=0;
		for(int i:a) {
			
			System.out.println(i);//read
			sum=sum+i;//10 15 35 65 80
		} 
		 
 System.out.println(sum);
 
 
 int max=a[0];
 for (int i=1;i<a.length;i++) {

	 if(a[i]>max)
	 {
		 	    max=a[i] ;
		 	    }
	 }
 System.out.println("Max is :"+max);
	
	
	

 int min=a[0];
 for (int i=1;i<a.length;i++) {

	 if(a[i]<min)
	 {
		 	    min=a[i] ;
		 	    }
	 }
 System.out.println("Min is :"+min);
	
	}

}
