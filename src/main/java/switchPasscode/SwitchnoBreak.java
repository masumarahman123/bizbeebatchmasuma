package switchPasscode;

public class SwitchnoBreak {
	//you have to pass the value directly in siwtch
		//base on your code/input it will give you result
		//one of the conditional statement 
	public void noBreak(int password) {
		switch( password) {
		case 001:System.out.println("eligible to next level");
		case 002:System.out.println("not eligible");
		case 003:System.out.println("need help");
		}
	}
	
	
	

	public static void main(String[] args) {
		
		SwitchnoBreak obj5=new SwitchnoBreak();
		obj5.noBreak(001);//no break so all the code is running
		
	}

}
