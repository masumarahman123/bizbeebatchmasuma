package ConditionalClass;

public class ConClass {
	/*Statements that allow us to check a condition and execute 
	certain parts of code depending on whether the condition is true or false 
	is called Java Conditional Statement.*/
	//Use if to specify a block of code to be executed, if a specified condition is true
	
	
	
	//if condition 
	public void methodforif(int num) {
		
		if (num<0) {
			System.out.println("Number is negative");}
			
		}
public void forif(int marks) {
		
		if (marks>90) {
			System.out.println(" Grade will be A+");}
			
		}
public void argmethod(int amount) {
	
	//Use else to specify a block of code to be executed, if the same condition is false	
	//if else condition
	if (amount<20) {
		System.out.println("Order will be dicline");
	}
	
	else {
		System.out.println("Order  recived and conframation no is 123");
	}
}
		
public void even(int a) {
	
	
	//if else condition
	if (a%2==0) {
		System.out.println("No. is even");
	}
	
	else {
		System.out.println("No.is odd");
	}
}
	
	public static void main(String[] args) {
		ConClass obj=new ConClass();
       obj.argmethod(15);
       obj.argmethod(80);
       //obj.methodforif(-1);
       obj.methodforif(1);
       obj.forif(98);
       
       obj.even(40);
       obj.even(7);
       obj.even(4);
	}

}
