package assignment1;

public class DivisibleBy5 {

	public static void main(String[] args) {

		for(int i=1; i<=100; i++) {
			if(i%5==0)
				System.out.println(i+" is divisible by 5");
			else
				System.out.println(i);
		}
	}

}
