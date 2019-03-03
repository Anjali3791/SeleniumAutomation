package oops;

public class Mobile extends Telephone
{

	public void texting()
	{
		System.out.println("Texting from Mobile");
	}
	
	public void calling() //Function overriding
	
	{
		System.out.println("Calling from Mobile");
		
	}
}
