package assignment1;

public class PrintEvenNumbers {

	public static void main(String[] args) {

//		for(int i=2; i<=100; i+=2) {
//			System.out.print(i+" ");
//		}
		
		System.out.println("Even numbers between 1 to 100 are :");
		for(int i=1; i<=100; i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}

}
