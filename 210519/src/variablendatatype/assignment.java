package variablendatatype;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =10;
int b=20;
int Temp=0;

Temp =a;

a=b;
System.out.println("value of a :" + a);
b=Temp;

System.out.println("value of b :" + b);

a=a+b;

b=a-b;
a=a+b;
System.out.println(b);
System.out.println(a);


	}

}
