package interfaceCode;

public interface Drawable {
	
	void draw(); // we can create method only like this(void draw()) without any information ,
						//except for default method and static method  
	
	// default method 
	
	default void msg(){  // default method is only for interface
		
		System.out.println("default method");
	
	}  
	
	//static method 
	
	static int cube(int x){ // actually static method is we can override
		
		return x*x*x;
		
	}  

}
