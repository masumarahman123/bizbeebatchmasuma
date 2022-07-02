package ConditionalClass;

public class ConClass1 {
//Use else if to specify a new condition to test, if the first condition is false

	  
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
	
	  
	
	public static void main(String[] args) {
		
		ConClass1 obj2=new ConClass1();
		
		obj2.conditionalmethod(30);
		obj2.conditionalmethod(100);
		obj2.conditionalmethod(165);
		
	}

}
