package codetest;

public class sample {
	
	// Access specifier examples- (Exmaple made btwn current class and "call2"(TestingCode package))
	// Private --  access only in same class
	// public -- access between different class, different package. 
	// protected -- access between same class and only differnet class in package but cannot access class outside of 
	// package
	
	
	//protected int x = 5;
	  public int x = 5;
	
	
	
	public void test() {
		
		System.out.println("Testing " + x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			sample a = new sample();
		
			a.test();
			System.out.println("sample " + a.x);
			
			a.x = 6;
			
		
	}
	

}


