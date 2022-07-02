package sStringInandReversedJava;

public class StringPrint2way {

	public static void main(String[] args) {
		 //Two way to print a string
		
		String x="I am not working";
		
		System.out.println(x);//1st way
		
		for(int i=0;i<x.length();i++) {//2nd using foe loop
			
			System.out.print(x.charAt(i));
		}
		System.out.println();
		
for(int i=x.length()-1;i>=0;i--) {//2nd using foe loop
			
			System.out.print(x.charAt(i));
		}
		
		

	}

}
