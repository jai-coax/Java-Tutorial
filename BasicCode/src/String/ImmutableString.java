package String;

public class ImmutableString {
	
	//In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.

    //Once string object is created its data or state can't be changed but a new string object is created.

	public static void main(String[] args) {
		
		   String s="Sachin";  
		   s.concat(" Tendulkar"); //concat() method appends the string at the end     
	       System.out.println(s); //will print Sachin because strings are immutable objects
	        
	        
	        
		   
	//	    s=s.concat(" Tendulkar");  // But we can concat two string by asigning like this.
		   
	//	   System.out.println(s); //will print Sachin Tendulkar because concated string asigned to string object
		   
	}

}
//Why string objects are immutable in java?

//Because java uses the concept of string literal.Suppose there are 5 reference variables,
//all referes to one object "sachin".If one reference variable changes the value of the object, 
//it will be affected to all the reference variables. That is why string objects are immutable in java.