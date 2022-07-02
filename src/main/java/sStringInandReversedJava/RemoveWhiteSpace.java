package sStringInandReversedJava;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String s="what is  java";
		String rep=s.replaceAll("\\s", "");
		System.out.println("before: "+s);	
		System.out.println("after : "+rep);	
					
		//find how many letters in the string
		//1st way remove white space print
		System.out.println("No.of Alphabet is::"+rep.length());
		
		//2nd way remove white space and use fo loop
		int countletter=0;	
		for(int i=0;i<rep.length();i++) {
			countletter=countletter+1;
	
		}

System.out.println("No. of alpha using for loop :"+countletter);
	}

}
