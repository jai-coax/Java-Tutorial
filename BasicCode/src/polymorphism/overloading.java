package polymorphism;

public class overloading {
	
	// Method overloading -- same method name with differnet parameter inside a single class
	
	// overloading happens in Compile time
	
	void test() {
		
		System.out.println("Method1 - No parameter");
		
	}
	
	
	void test(int a) {
	
		System.out.println("Method2 - single parameter" + a);
		
	}
	
	
	void test(int a,int b) {
		
		System.out.println("Method2 - two parameter" + a + " " + b);
		
	}
	

	public static void main(String[] args) {
	
		overloading a = new overloading();
		
		a.test();
		a.test(1);
		a.test(2, 3);
		

	}

}
