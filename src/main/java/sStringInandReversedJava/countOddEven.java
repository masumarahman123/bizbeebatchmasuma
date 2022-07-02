package sStringInandReversedJava;

public class countOddEven {

	public static void main(String[] args) {
		
		
		int p=123456709;
		int counteven=0;
		int countodd=0;
		
		while(p>0) {
			int rem=p%10;
			if(rem%2==0) {
				
				counteven++;
			}
			else {countodd++;}
		
		p=p/10;
		}
	
				
		System.out.println("The no. is  : "+counteven);				
		System.out.println("The no. is  : "+countodd);	
	}

}
