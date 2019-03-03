package functions;

public class FunClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int a=10; int b=20; System.out.println(a+b);
		 * 
		 * int c=10; int d=20; System.out.println(c+d);
		 */
		
		//Calling the function
		
		int add= sum(10,20);
		System.out.println(add);
		
		print();
		
	}
	
	public static int sum(int a, int b)
	{
		/* System.out.println(a+b); */
		
		int c= a+b;
		
		return c;
		
	}
	
	public static void print()
	{
		System.out.println("Welcome to Selenium");
	}

	
	
}
