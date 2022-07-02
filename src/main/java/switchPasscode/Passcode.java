package switchPasscode;

public class Passcode {	
	//if you dont want to use /run you need to use break key word 
	//i.e break will be use to follow your direction 
	//default statement run when non of case match
	int passcode = 002;
	void switchgate(int passcode) {
	switch(passcode){
	case 001:System.out.println("Student parking");
				System.out.println("Go to 4th floor for parking");
	
	break;
	case 002:System.out.println("Teacher parking");
	break;
	case 003:System.out.println("Office  parking");	
	break;
   default:System.out.println("Guest parking");
   				System.out.println("go to office and take ticket for valid parking");
	//you can write any code 
	int price=3;int hour=1;
	System.out.println("3 dollar per hour");
	}
	}
	public static void main(String[] args) {
	
		
		Passcode obj= new Passcode();
		//obj.switchgate(008);
		obj.switchgate(002);
		obj.switchgate(000);
		obj.switchgate(001);
	}
		
		
		

	}


