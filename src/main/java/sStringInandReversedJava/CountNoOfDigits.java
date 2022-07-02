package sStringInandReversedJava;

public class CountNoOfDigits {

	public static void main(String[] args) {
		
		int num=123456701;
		int count =0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("The no. of digits is "+count);
		
		

	}

}
