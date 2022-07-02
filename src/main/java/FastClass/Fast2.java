package FastClass;

public class Fast2 {
	//method set of instruction comdined togahter to perform a task
	/*• Instance variables are automatically initialized to their default values during 
	object creation.
	For example, before setting values to the object, int will be 0, String will 
	be null, float will be 0.0f
	• Local variables (declared in methods) have to be initialized before they can 
	be used
	• Variables referring to objects are called reference variables.
	In the above code, <objectName> is a reference variable
	*/
	int p;//global variable//declaration
	 int q=23;//initialization
	void add() {
		int x=12;//local variable
		int e=11;
		int a=x+e;
		System.out.println(a);
	}
	
	
	void sub() {
		int x=13;
		int e=15;
		int z=x-e;
		System.out.println(z);
	}	
	
	 
	public static void main(String[] args) {
		//if I want to run the method we need main method
		//new is allocate the object some memory space   
		Fast2 obj= new Fast2();//new key word allocate memory space 
		
		obj.add();
		obj.sub();
		obj.add();
		obj.sub();
		
	}

}
