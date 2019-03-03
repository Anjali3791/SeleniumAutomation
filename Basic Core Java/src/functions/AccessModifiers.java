package functions;

public class AccessModifiers {
	
	public void publicfun() {
		
		System.out.println("Public from AccessModifiers");
	}
	
	private void privatefun() {
		
		System.out.println("Private from AccessModifiers");
	}

	protected void protectedfun() {
	
		System.out.println("Protected from AccessModifiers");
	}
	
	void noAccessModfun() {
		
		System.out.println("noAccessMod from AccessModifiers");
	}
	
	
	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		obj.privatefun();	
		obj.publicfun();
		obj.noAccessModfun();
		obj.protectedfun();
		
	}
}
