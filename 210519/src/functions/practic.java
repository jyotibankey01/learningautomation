package functions;

public class practic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practic p = new practic();
		p.privatemethod();
		p.protectedmethod();
		p.publicmethod();
		p.noaccessmodmethod();
	}
//public
	public void publicmethod() {
		System.out.println("public method");
	}
	//private
	private void privatemethod() {
		System.out.println("private mentod");
	}
	//no Access mo
	void noaccessmodmethod() {
		System.out.println("noaccess modmethod");
	}
	//protected
	protected void protectedmethod() {
		System.out.println("protected method");
	}
	
}
