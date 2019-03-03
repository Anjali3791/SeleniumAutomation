package loops;

import functions.AccessModifiers;

public class FunTestCalling extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AccessModifiers fun = new AccessModifiers();
		fun.publicfun();
		
		FunTestCalling test = new FunTestCalling();
		test.protectedfun();
		
		
	}

}
