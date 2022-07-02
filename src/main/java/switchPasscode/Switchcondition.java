package switchPasscode;

	public class Switchcondition {
		//Use switch to specify many alternative blocks of code to be executed
		/*The switch expression is evaluated once.
		The value of the expression is compared with the values of each case.
		If there is a match, the associated block of code is executed.
		If there is no match, the default code block is executed.*/
		
		/*When the break statement is encountered inside a loop, the loop is 
		immediately terminated and the program control resumes at the next 
		statement following the loop.8*/
		
		public void switch2(int countday) {
			switch(countday) {
			case  7:System.out.println("A Week");
			break;
			case  30:System.out.println("A Month");
			break;
			case  365:System.out.println("A Year");
			break;
			 default:System.out.println("Ivalid");
		}
			}
		public static void main(String[] args) {
			
			Switchcondition obj4=new Switchcondition();
		 
			obj4.switch2(30);
		    obj4.switch2(1000);//
		    obj4.switch2(00);//still running 
		}

	}
	

