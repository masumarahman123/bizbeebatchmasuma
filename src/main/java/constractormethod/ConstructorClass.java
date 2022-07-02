package constractormethod;

public class ConstructorClass {
 public  ConstructorClass() {
	 System.out.println(" I am constructor");
 }
 public  void MClass() {
	 System.out.println(" I am not constructor.so call me using obj");
 }
 public  void Mass(String x) {
	 System.out.println(" I am public ,void.so call me using obj");
 }
	public static void main(String[] args) {
		
		ConstructorClass obj=new ConstructorClass();
		
		obj.MClass();
		obj.Mass("masuma");
		
		//I create the class of the object only and did not call
		//but when run it executed automaticaly by default
		//thats why it is saing invoked automaticaly
		//q--how you are invoke it
		//ans-by the 2nd part-ConstructorClass()
	
		

	}

}
