package ConditionalClass;

public class ConClass3 {

	public void elseifcon(int day) {
	
		//int day=7;
		if(day>=1) {System.out.println("Friday");}
		else if(day>=2) {System.out.println("Satarday");}
		else if(day>=3) {System.out.println("Sunday");}
		else if(day>=4) {System.out.println("Monday");}
		else if(day>=5) {System.out.println("Tuesday");}
		else if(day>=6) {System.out.println("Wednesday");}
		else if(day>=7) {System.out.println("Thursday");}
		else {System.out.println("Default");}
		
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
	public static void main(String[] args) {
		ConClass3 obj3=new ConClass3();
		//obj3.elseifcon(2);
		//obj3.elseifcon(-3);
		//obj3.elseifcon(8);
		
		//obj3.conditionalmethod(80);
		obj3.conditionalmethod(90);
		//obj3.conditionalmethod(70);
	}

}
