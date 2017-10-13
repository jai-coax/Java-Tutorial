package polymorphism;

public class overRiding extends polyTest {
	
	// Method overridding - Same method name with same parameter in different class(extended Class)
	
	// overridding happens in Run time
	
	// Static method cannot be overridded
	
	
	public void run() {
		
		System.out.println("Class B - sample");
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overRiding b = new overRiding();
		
		//polyTest b = new polyTest();
		
		b.run();
		

	}

}
