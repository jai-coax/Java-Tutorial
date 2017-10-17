package String;

public class JavaString {
	
	
	// Java String  -- In java, string is basically an object that represents sequence of char values. 
	              // An array of characters works same as java string
	
	char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
	String s1=new String(ch); 
	
	// same as below,
	
	String s2="javatpoint";
	
	// Java String class provides a lot of methods to perform operations on string 
	   //such as compare(), concat(), equals(), split(), length(), replace(), 
	//compareTo(), intern(), substring() etc.
	
	// The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
	
	// CharSequence Interface - The CharSequence interface is used to represent sequence of characters.
	                           //It is implemented by String, StringBuffer and StringBuilder classes. 
	                           //It means, we can create string in java by using these 3 classes.

	// The java String is immutable i.e. it cannot be changed. Whenever we change any string, a new instance is created. 
	//For mutable string, you can use StringBuffer and StringBuilder classes.
	
	
	// The java.lang.String class is used to create string object.
			// There are two ways to create String object:
						//By string literal
	                   //By new keyword
	
	// String Literal - Java String literal is created by using double quotes. For Example:
	
	String a1="welcome";
	
	String a2="welcome";// we will not create new instance like this
	
	//Why java uses concept of string literal?
          //To make Java more memory efficient (because no new objects are created 
	                          //if it exists already in string constant pool).
	
	// By new keyword

    String s=new String("Welcome");//creates two objects and one reference variable  

}
