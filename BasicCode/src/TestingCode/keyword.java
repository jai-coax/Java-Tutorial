package TestingCode;

public class keyword {
	
	int numbr;
	String name;
	static String company = "FE"; // Static keyword assigned for variable
	
	// Final String company = "FE"; // Final keyword assigned for variable
	
	// These keywords cannot be used for constructor 
	
	// it is a constructor
	keyword(int r, String n) {
		numbr = r;
		name = n;
		System.out.println(numbr + " " + name + " " + company);
	}
	
/*	// it is a Method with parameter
	void test(int r, String n) {
		numbr = r;
		name = n;
		System.out.println(numbr + " " + name + " " + company);
	}*/
	// it is a Method without parameter
	void display() {
		System.out.println(numbr + " " + name + " " + company);
	}

	public static void main(String[] args) {
		// Static Keyword
		
		// Final/Static keyword -- It can be used b4 class, method and variable.
		// If Final keyword FB4 class - you cannot inhert
		// If Final keyword FB4 method - you cannot Override and Overload
		// If Final keyword FB4 variable - you cannot Override and Overload
		
		company = "Accenture"; // IF "company" variable is Static we can overide this variable 
								// IF "company" variable is Final we cannot overide this variable
		// Using constructor here
		keyword s1 = new keyword(647, "Jai");
		keyword s2 = new keyword(648, "dilli");
		
		s1.display();
		s2.display();
		
		// Using Method here
		/*keyword s3 = new keyword();
		s3.test(647, "Jai");
		
		s3.display();*/
		

	}

}
