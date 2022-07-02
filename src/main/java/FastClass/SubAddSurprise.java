package FastClass;

public class SubAddSurprise {

	int x=30;//global variable//declaration
	 int y=40;
	void add() {		
		int c=x+y;
		System.out.println(c);
	}	
	void sub() {
		 x=80;
		 y=50;
		int c=x-y;
		System.out.println(c);
}
		public static void main(String[] args) {
		 
		SubAddSurprise objs=new SubAddSurprise();
		objs.add();
		objs.sub();
		objs.add();
		objs.add();		
	}
}
