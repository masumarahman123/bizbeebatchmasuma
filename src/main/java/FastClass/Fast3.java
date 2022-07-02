package FastClass;



public class Fast3 {

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
	  
	  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Fast3 obj1=new Fast3();
		
		
		obj1.add();
		obj1.casting();
		obj1.dob();
		obj1.max(12, 0);
	}

}
