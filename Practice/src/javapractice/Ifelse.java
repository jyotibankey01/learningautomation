package javapractice;

public class Ifelse {

	public static void main(String[] args) {
		/*int age=11;
		if(age%2==0)
			System.out.println("evnen");
		else {
			System.out.println("odd");
		}*/
		int year =2020;
		if((year%4==0)&&(year%100!=0)||(year%400==0))
			System.out.println("leap year");
		else {
			System.out.println("common year");
		}
	}

}