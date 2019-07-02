package functions;

public class fuctionclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(validage(60));
System.out.println(validage(7));
System.out.println(validage(58));

	}
public static boolean validage(int age) {
	
	if (age>60 || age<8) {
		return true;
	}else {
		return false;
	}
	
}
}
