package constractormethod;

public class ParametarizeConstructor {

	int x;
	int y;
	
	ParametarizeConstructor(int p,int q){
	
		this.x=p;//this indicate global variable
		this.y=q;
		
		System.out.println("I am ParametarizeConstructor(int p,int q)");
	}
	
	public void add() {
		int c=x+y;
		System.out.println(c);
	}
	void sub() {
	int	s=x-y;
	System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		ParametarizeConstructor obj= new ParametarizeConstructor(30,10);//initialize the value
			obj.add();
	
	}

}
