package staticKeyWord;

public class NonStaticClassInJava {

	int bal=500;
	public void deposit(int a) {
		
		bal=bal+a;
		System.out.println(bal);
	}
	
	public void withdraw(int b) {
		bal=bal-b;
		System.out.println(bal);
	}
	
	public static void main(String[] args) {
		
		NonStaticClassInJava obj=new NonStaticClassInJava();

		obj.deposit(200);
		obj.withdraw(300);
		
		NonStaticClassInJava obj1=new NonStaticClassInJava();		
		obj1.deposit(100);
		obj1.withdraw(300);
		
		
		NonStaticClassInJava obj2=new NonStaticClassInJava();		
		
		obj2.withdraw(300);
	}

}
