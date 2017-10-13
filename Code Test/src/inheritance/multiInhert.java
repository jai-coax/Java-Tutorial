package inheritance;

public class multiInhert extends singleInhert {

	int test2 = 10;
	
	void sample() {
		
		super.sample(); // If parent class method and current class method name are same then we need to use
		                            // SUPER keyword to call the imedeite invoke of parent class methods...
		testing();
		
		System.out.println("class 2 execution");
	}
	
	multiInhert(){
		
		System.out.println("class 2 constructor");
	}
	
}
