package sStringInandReversedJava;

public class ReversedWordInSent {

	public static void main(String[] args) {
		
		String s="What do you know about Java";
		
		String[] sw=s.split(" ");//we make it array because string can't handle multiple datatype
		String revStr=" ";
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			System.out.print(s.charAt(i));
		}
		
			
		

	}

}
