package TestingCode;

public class thismethod {
	
	
	void test1() {
		
		System.out.println("Method 1 testing");
	}
	
	void test2() {
		
		this.test1();
		
		System.out.println("Method 2 testing");
	}
	
	thismethod(){
		
		this.test2();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	thismethod a = new thismethod();
	
	//a.test1();

	}

}
