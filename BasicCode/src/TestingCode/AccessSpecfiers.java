package TestingCode;

public class AccessSpecfiers {

	// Access specifiers/modifers  -- They are used for class, method and data types..
	 //   Public , Private, Protected, Final and Abstract
	
	// For an class we can use only public, final and Abstract
	
	// Private and Protected cannot used for class
	
	int x;
	
	
	private class test2 { // For inner class we can use private
	//	System.out.println();
		
	}
	
	
	class test3 { // Default class -- Default class cannot be accessed outside of the package, so we should 
		// do public to access outside the package 
		
		// Default class can be accessed in extented class in same package but cannot accessed in extended class 
		// outside the package
		
	}
	
	
	protected void method() { // Protected access inside the "main class" and also for "extented class"
		
		// protected class can be accessed both in extented class in same package and also accessed in extended class 
				// outside the package
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printtest obj = new Printtest();
		
		obj.print();
		
		obj.x = 35;

	}

}
