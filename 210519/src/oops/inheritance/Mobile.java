package oops.inheritance;

public class Mobile extends telephone{

	public void texting() {
		System.out.println("i can text from mobile");
	}
	//when same function with same name and same no of paramerter is present in bot perent and child class this concept is know as function overriding
	public void calling() {
		System.out.println("i can call from mobile also");
	}
}
