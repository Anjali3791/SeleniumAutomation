package exceptions;

import java.io.FileInputStream;

import oopsAbstraction.HDFC;

public class LearnException2 {

	public static void main(String[] args) 
	{
		
		int a = 10;
		int b = 20;
		
		try {
		System.out.println(a/b);  //here business logic is to be written and if any exceptions occurs it will go in catch block
		
		HDFC b1 = new HDFC();
		b1.demonetization();
		
		//FileInputStream file = new FileInputStream("dshjhfj");
			
		throw new Error("Testing Error");
		
		}
		
		catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
			
		}
		catch(RuntimeException e) {
			
			System.out.println(e.getMessage());
		}
		
		catch(Exception e){  //Recovery code will be written here in catch
			
			System.out.println(e.getMessage());
		}
		catch (Throwable e)
		{
			System.out.println(e.getMessage());
			
		}
		
	
		System.out.println("Testing");
		
		
	}

}
