package oops.inheritance;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Smartphone s1=new Smartphone();
s1.calling();
s1.internet();
s1.texting();
System.out.println("=====================");
telephone s2=new telephone();
s2.calling();
System.out.println("=====================");
Mobile s3=new Mobile();
s3.calling();

s3.texting();
	}
	//dynamic polymorphism, upcasting, runtime polymorphism

}