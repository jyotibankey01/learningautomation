package stringClass;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name ="Anand";
String name2 ="Anand";
//charAt
System.out.println(name.charAt(4));
//Equalignorecase
System.out.println(name.equalsIgnoreCase(name2));
//Equal
if(name.equals(name2)) {
	System.out.println("name are same");
	
}
else
	System.out.println("not same");
//length
System.out.println(name.length());
//replace
System.out.println(name.replace('a', 'j'));
System.out.println(name.replace("A", "ana"));
//Split
String[] s=name.split("n");
System.out.println(s.length);
for(int i=0; i<s.length; i++) {
	System.out.println(s[i]);
}
String[] arr= {"surajeet"};
for(String a :arr) {
	System.out.println(a);
}

	}
	

}
