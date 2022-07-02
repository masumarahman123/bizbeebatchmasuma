package com.something;

public class FristClass2 {
	 int x=10;
	 int y=20;//initialization
	 int c;//declaration
	 
	 void add() {
		  c=x/y;//arithmatic operatror + - *  %
		  System.out.println(c);
	 }
	 
	 
	 //non-parametarized method
	 
	public void dob() {
		
		double c=x/y;
		System.out.println(c);
	} 
	
	// casting
	public void casting() {
		
		
		double c= (double)x/y;
		System.out.println(c);
	}
	
	 //parameterized
	
	  public void max(int x, int y) {
		  
		  c=x+y;
		 System.out.println(c); 
	  }
	  
	  
	 
	  
	  public void conditionalmethod(int a) {
		  
		 if(a>40) {//relational operetor =<
			 
			 System.out.println("the student is pass");
		 }
		 
		   if(a>100) {
			 System.out.println("The student is above and beyond");
		 }
		 
		   if(a >=90) {
			 System.out.println("The student is above ");
		 } 
		 else { System.out.println("The student is fail");}
	  }
	
	  
	public void switchGate(int  code) {//varibale
		//
		switch(code) {//reduce the code--(variable)
		
		case 001 :System.out.println("Student enter");	break;
		case 002 :System.out.println("Teacher enter");	break;
		case 003 :System.out.println(" Maintainance");	break;
		 default :System.out.println("Don't open");	
		 System.out.println("Guest is here");
		 
		}
	}  
	  
	  
	public static void main(String[] args) {
		
		FristClass2 obj=new FristClass2();
		
		
		obj.add();
		obj.casting();
		obj.dob();
		obj.max(12, 0);
		
		
		obj.conditionalmethod(30);
		obj.conditionalmethod(100);
		obj.conditionalmethod(165);
		
		
		obj.switchGate(001);
		obj.switchGate(006);
		
	}

}
