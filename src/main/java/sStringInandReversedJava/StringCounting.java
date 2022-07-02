package sStringInandReversedJava;

public class StringCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Long live Bangla";
		
		System.out.println(str);
		System.out.println(str.length());
		
		String lower= str.toLowerCase();
		System.out.println(lower);
		
		String upper=str.toUpperCase();
		System.out.println(upper);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				count=count+1;
			}
		}
		System.out.println(count);
		
	}

}
