package staticKeyWord;

public class StaticMethod {

	static int bal=500;
	int x=10;
	int y=20;
	public static void stmeth() {
		
		//int z=x+y; //stsic method can not handle non-Static variable 
		System.out.println("I am static");
	}
	public void deposit(int a) {
		
		bal=bal+a;
		System.out.println(bal);
	}
	
	public void withdraw(int b) {
		bal=bal-b;
		System.out.println(bal);
	}
	
	private void addition(int z) {
		int p=x+y;
		System.out.println(z=p);
	}
	public static void main(String[] args) {
		StaticMethod.stmeth();
	
	}

}
