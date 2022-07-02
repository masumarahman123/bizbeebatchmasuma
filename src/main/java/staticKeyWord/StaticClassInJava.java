package staticKeyWord;

public class StaticClassInJava {

	static int bal=500;
	public void deposit(int a) {
		
		bal=bal+a;
		System.out.println(bal);
	}
	
	public void withdraw(int b) {
		bal=bal-b;
		System.out.println(bal);
	}
	
	public static void main(String[] args) {
		
		StaticClassInJava obj=new StaticClassInJava();

		obj.deposit(200);
		obj.withdraw(300);
		
		StaticClassInJava obj1=new StaticClassInJava();		
		obj1.deposit(100);
		obj1.withdraw(300);
		
		StaticClassInJava obj2=new StaticClassInJava();		
		
		obj2.withdraw(300);
	}

}
