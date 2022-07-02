package sStringInandReversedJava;

public class StringInClassWork {

	public static void main(String[] args) {
		
		
		String con="United States Of America";
		String[] pcs=con.split(" ");		
		System.out.println(pcs.length);//4
		
		String rep=con.replaceAll(" ", "");
		System.out.println(rep.length());//
		
		//String lower=con.toLowerCase();
		
		System.out.println(con.length());//24
		System.out.println(con);//print
		
		int count=0;
				 for(int i=0;i<con.length();i++) {
				count++;	 
				System.out.println(con.charAt(i));	 
				 
				 }
       System.out.println("with space :"+count);//24
       int countx=0;
		 for(int i=0;i<rep.length();i++) {
		countx++;	 
		System.out.println(rep.charAt(i));	 
		 
		 }
System.out.println("without space "+countx);//21
	}

}
