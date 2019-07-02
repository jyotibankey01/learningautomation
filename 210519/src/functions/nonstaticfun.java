package functions;

public class nonstaticfun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nonstaticfun f=new nonstaticfun();
		f.func();
	}
	public void func() {
		System.out.println("hello");
	}

}
//a call static function to diffrent class we do not need to create the object of that class instead we use class name to class that function
//to call non static function to need to create object of class
//object is intant of class
