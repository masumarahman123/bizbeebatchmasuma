package reviewclass;

public class review {

	
	
	
	public void somename() {
		int a=10;//hard code
		int b=5;
		int c= a+b;
		String x="Mohammed";
		System.out.println(c);
		
		
		if(c<50) {
			System.out.println("Execute code");
			
		}
		
		else {System.out.println("Not valid");}
	}
	
	public void mane(int x) {
		switch(x) {
	
		case 10:System.out.println("I am not ableable");
		case 20:System.out.println("I am at home");
		case 30:System.out.println("Wait 5 min");  
		default :System.out.println("Call will be return");
		
		
	String name ="MasumaRahman";
		System.out.println(name);
	}}
	public static void main(String[] args) {
		
		review obj = new review();
		obj.somename();
		obj.mane(33);
	}

}
