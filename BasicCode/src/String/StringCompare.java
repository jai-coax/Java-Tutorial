package String;

public class StringCompare {
	
	//We can compare string in java on the basis of content and reference.

	//It is used in authentication (by equals() method), sorting (by compareTo() method), 
	//reference matching (by == operator) etc.

	//There are three ways to compare string in java:
	       //By equals() method
	       //By = = operator
	       //By compareTo() method
	
	public static void main(String[] args) {
		
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   String s4="Saurav"; 
		   String s5="SACHIN"; 
		   String s6="Ratan";
		   
		// 1) String compare by equals() method
		       // The String equals() method compares the original content of the string. 
		       //It compares values of string for equality. String class provides two methods:
		   System.out.println("String compare by equals() method");
		     // (i) public boolean equals(Object another) compares this string to the specified object.
		   
		   System.out.println(s1.equals(s2));//true  
		   System.out.println(s1.equals(s3));//true  
		   System.out.println(s1.equals(s4));//false
		   
		    // (ii) public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.
		   
		   System.out.println(s1.equals(s5));//false  
		   System.out.println(s1.equalsIgnoreCase(s5)); //true 
		   
		// 2) String compare by == operator 
		   // The = = operator compares references not values.
		   System.out.println("String compare by == operator");
		   
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 
		   
		   
	   // 3) String compare by compareTo() method
		      //The String compareTo() method compares values lexicographically and 
		       //returns an integer value that describes if first string is less than, 
		       //equal to or greater than second string.
		   System.out.println("String compare by compareTo() method");
            //Suppose s1 and s2 are two string variables. If:
                   //s1 == s2 :0
                   //s1 > s2   :positive value
                   //s1 < s2   :negative value
		   
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s6));//1(because s1>s3)  -- because "S" is 1 time greater than "R"  
		   System.out.println(s6.compareTo(s1));//-1(because s3 < s1 )  -- because "R" is 1 time lower than "S" 
		   
		   System.out.println(s1.compareTo(s4)); // S and a char are equal, by checking next char c and u 
		                                                                       // "c" is 18 time lower than "u"
	}

}