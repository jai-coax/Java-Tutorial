package codetest;

public class methodtest {
	
	
	methodtest() { // constructor -- it should be named as same as class name
		
		System.out.println("sample");
	}
	
	
	void methodname() { // Method
		
		System.out.println("sample1");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("testing");
		
		methodtest a = new methodtest(); // Contructor executed here
		
		a.methodname(); // Method executed here
		
	}

}
