package sStringInandReversedJava;

public class RepeatedLeterInString {

	public static void main(String[] args) {
		//total len
		//len after remove a
		//#before lower case
		String s="LOvely boy looks like lolipop";
		System.out.println(s.length());

		int totalcount=s.length();		
		int totalcountafter_remove=s.replaceAll("o","").length();
		System.out.println();		
		int count=totalcount-totalcountafter_remove;
		System.out.println(count);
		
		//with lowercase
		
		String s1="LOvely boy looks like lolipop";
		System.out.println(s1.length());
		int totalcount1=s1.length();
		
		String cc=s1.toLowerCase();//cc--convert lowercase
		System.out.println(cc.length());		
		int totallen1 =cc.length();
		
		String rep_o=cc.replaceAll("o", "");
		System.out.println(rep_o.length());
		int totallen2=rep_o.length();
				
		int total_O=totallen1-totallen2;
		System.out.println(total_O);
	}

}
