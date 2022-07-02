package com.ParametarizedMethod;

public class PassArgument {

	int x=23;
	int y=22;
	int c;
	
	void mul() {//normal method//concret method
		 
		c=x/y; 
		System.out.println(c);
	}
	//parameterized method
	public void add(int x,int y) {
		
		c=x+y; 
		System.out.println(c);
	}
	
	public void sub(int x, int y) {//casting
		
		double c=(double)y/x;
		System.out.println(c);
	}
	
public void div(int x, int y) {
		
		 c=y/x;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		PassArgument obj=new PassArgument();

		
		obj.mul();
		obj.add(2, 5);
		
		obj.sub(5,10);
		obj.div(5, 10);
		
	}

}
