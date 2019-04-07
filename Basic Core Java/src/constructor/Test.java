package constructor;

public class Test {

	int num;
	String str;
	
	//Default Constructor
	public Test() {
		System.out.println("default constructor invoked");
	}
	
	public Test(int x, String t) {
		System.out.println("parameterized constructor invoked");
		this.num = x;
		this.str = t;
	}
}
