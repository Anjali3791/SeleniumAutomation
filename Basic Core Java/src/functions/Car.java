package functions;

public class Car {
	
	String name;
	String model;
	int wheels;
	String colour;
	
	public Car(String name, String model, int wheels, String colour) //Constructor
	{
		this.name = name;  				//"this." is used to assign the global variable the value of instance value
		this.model = model;
		this.wheels = wheels;
		this.colour = colour;		
		
		
	}
	
	public Car() //Constructor overloading
	{
		
		
	}
	
	public static void drive()
	{
		//Car c = new Car();
		//System.out.println("The "+c.name+" car of model "+c.model+" have "+c.wheels+" wheels and in "+c.colour+" colour");
	}
	public void transport() {
		
		System.out.println("The "+name+" car transports passengers from pune to mumbai");
	}
	
	
	public void specification() {
		
		System.out.println("The "+name+" car of model "+model+" have "+wheels+" wheels and in "+colour+" colour");
		
	}
	
	

}
