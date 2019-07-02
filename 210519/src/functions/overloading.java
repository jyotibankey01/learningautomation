package functions;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(10, 20));
System.out.println(sum(10, 20, 30));
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int  sum(int a, int b, int c) {
		return a+b+c;
	}
	public static void sum(int a, String b) {
		//return a+b;
	}
	public static void sum(String a, int b) {
		//return a+b;
	}
}
