package constractor;

public class Car {

	String name;
	String color;
	String model;
	int wheels;
	int maxSpeed;
	
	public Car( String color, String model) {
		//Class variable name=constractor variable
		
		this.color=color;
				
				this.model=model;
				
		
		
	}
	public Car(String name, String color, String model, int maxSpeed, int wheels) {
		//Class variable name=constractor variable
		this.name=name;
		this.color=color;
				this.maxSpeed=maxSpeed;
				this.model=model;
				this.wheels=wheels;
	}
	
	public void driving() {
		System.out.println("I can drive my "+color+" color "+name+" car at maximum speed of "+maxSpeed+" kmph");
	}
	public void brake() {
		System.out.println(name+" has powerbreak on" +wheels);
	}
	public void accerlat() {
		System.out.println("driving a "+color+"  "+model);
	}
	
}
