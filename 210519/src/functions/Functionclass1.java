package functions;

public class Functionclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("sum " +sum(1,2,3)); 
System.out.println("sub " +sub(2,1));
System.out.println("multi " +multi(3, 3, 3));
System.out.println("div " + div(10, 2));
	}

	public static int sum(int a, int b,int d) {
		
	int c= a+b+d;
	return c;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int multi(int a, int b, int c) {
		return a*b*c;
	}
	public static int div(int a, int b) {
		return a/b;
	}

}
