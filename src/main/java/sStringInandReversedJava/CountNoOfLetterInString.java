package sStringInandReversedJava;

public class CountNoOfLetterInString {

	public static void main(String[] args) {
		String s="United State  Of America";
		String wsp=s.replaceAll(" ", "");
		System.out.println(s);
		System.out.println(wsp);
		System.out.println("No.Of Charecter :"+s.length());
		System.out.println("No.Of Alphabet :"+wsp.length());
		
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.print(s.charAt(i));
		}
		
		
	}

}
