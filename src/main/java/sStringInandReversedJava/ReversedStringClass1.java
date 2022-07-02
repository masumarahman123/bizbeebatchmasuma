package sStringInandReversedJava;

public class ReversedStringClass1 {

	public static void main(String[] args) {
		//word or sentence you want to reversed
		//concat
		String str="ABCD";
		String rev="";
		
		System.out.println("The length is :"+str.length());
		 
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
System.out.println("The rev word :"+rev);
	//array
	String p="bangladesh";
	String rev1="";
	char a[]=p.toCharArray();
	
	int len=p.length();
	for(int i=len-1;i>=0;i--) {
		
		rev1=rev1+a[i];
	}
	System.out.println("The array is :"+rev1);
	
	//String Buffer class
	
	String q="I miss Bangladesh";
	
	StringBuffer  obj= new StringBuffer(q);
	System.out.println("By buffer class:  "+obj.reverse());
	
	}

}
