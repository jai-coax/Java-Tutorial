package TestingCode;

//Super Keyword --  Used to refer the immediate parent class object
			//         super() -- Is used to invoke immedite parent class constructor
			//         			-- Is used to invoke immedite parent class Method
			//                  -- Is used to invoke immedite parent class varible


class Superkeyword {
						
		int test = 50; // using Variable
		 
		void mess() {  // Using Method
			
			System.out.println("Main Class Method");
		}
		
		Superkeyword() { // Using Constructor
			
			System.out.println("Main Class Contructor");
		}
				
}

class class2 extends Superkeyword {
	
	int test = 100;
	
	void mess() {
		
		System.out.println("Extended Class Method");
	}
	
	
	class2() { // Using Constructor
		
		super();
		System.out.println("Extended Class Contructor");
		
	}
	
	
	void display() {
		System.out.println(super.test);  // Calling immediate invoked variable from main class
		//System.out.println(test);  // Calling immediate invoked variable in same class
		
		//mess();  // Calling immediate invoked Method from main class
		super.mess();  // Calling immediate invoked Method from main class
		
	}
	
	public static void main(String[] args) {
		
		class2 a = new class2();
		
		//Superkeyword b = new Superkeyword();
		
		a.display();

	}
	
}
