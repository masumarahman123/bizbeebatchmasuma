package oopsJavaInheritance;

public class ReturnTypeMethod2 {
int bal=1000;
	public void getMethod() {
		int a=250;
		System.out.println(a);
	}
	public void deposit(int x) {
		ReturnTypeMethod2 obj=new ReturnTypeMethod2();
		bal=bal+x+obj.getIncentive(x);
		System.out.println(bal);
	}
	public int getIncentive(int dep) {
		int incen=0;
		if(dep>1000) {
			incen=20;
		}
		if(dep<1000) {
			incen=10;
		}
		return incen;
	}
	
	public static void main(String[] args) {
		 ReturnTypeMethod2 obj=new  ReturnTypeMethod2();
	
	obj.deposit(2000);
	}

}
