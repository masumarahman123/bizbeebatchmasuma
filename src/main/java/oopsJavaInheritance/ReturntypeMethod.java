package oopsJavaInheritance;

public class ReturntypeMethod {
 public void getMoney() {
	 int a=250;
	 
 //System.out.println(a);//not return value//print only
 
 }
 public int getIncentive() {
	 int a=350;
	 return a;
 }
	public static void main(String[] args) {
		ReturntypeMethod obj= new ReturntypeMethod();
	obj.getMoney();
	obj.getIncentive();
	System.out.println(obj.getIncentive());
	//System.out.println(obj.getMoney());
	
	
	}

}
