package constructor;

public class ConstructorDemo {

	public static void main(String[] args) {

		//Test test = new Test();
		
		Test test2 = new Test(2, "Anjali");
		
		System.out.println(test2.num+" "+test2.str);
	}

}
