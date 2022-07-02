package constractormethod;

public class ConstructorOverLoading {
	int a=0;
	int b=0;
	double c=0;

	ConstructorOverLoading(){
		a=10;
		b=20;
		c=30.05;
		System.out.println(" I am con....");
	}
	
	ConstructorOverLoading(int x, int y){

		a=x;
		b=y;
		System.out.println();
}

	ConstructorOverLoading(int x, double y){
		
		a=x;
		c=y;
		
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
	System.out.println(c);
	
	}

	public static void main(String[] args) {
		
		
		ConstructorOverLoading con= new ConstructorOverLoading();
	
	
	
	
	}
	

}
