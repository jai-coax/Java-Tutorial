package abstractClass;

abstract class Bike {
	
	// in this im using constructor, data member, methods etc.
	
	     abstract int getRateOfInterest(); // Abstarct varible
	
	    Bike(){ //constructor
	    	
	    	System.out.println("bike is created");
	    	
	    }  
	    
	   abstract void run();  // Abstarct Method
	   
	   void changeGear(){ // methods
		   
		   System.out.println("gear changed");
		   
		 } 
	
	

}