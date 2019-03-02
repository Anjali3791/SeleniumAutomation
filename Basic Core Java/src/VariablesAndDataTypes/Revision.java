package VariablesAndDataTypes;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Data types
		int age = 30;
		
		System.out.println(age);
	
		//Loops
		
		for(int i = 1; i<=10; i++) {
			
			System.out.println(i);
		}
		
		//Conditional statements
		
		int a=10;
		int b=20;
		
		if (a>b) {
			System.out.println("a is greatest");
		
		}
		else {
			System.out.println("b is greatest");
			
		}
		
		//Array
		
		String [] str = new String [3]; //3 here is index or length of array
		str [0] = "Anand";
		str [1] = "Bhayre";
		str [2] = "Tech Bodhi";
		
		
		//10, true and Anand
		
		Object[] obj = new Object [3];
		
		obj [0]= 10;
		obj [1] = true;
		obj [2] = "Anand";
		
		System.out.println(obj [2]);
		
		
		
		
		
	}
		
}
