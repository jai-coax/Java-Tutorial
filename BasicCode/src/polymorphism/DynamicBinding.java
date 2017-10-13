package polymorphism;

public class DynamicBinding extends polyTest {
	
	// Dynamic binding - When type of the object is determined at run-time, it is known as dynamic binding.

	void eat(){
		
		System.out.println("dog is eating...");
		
	}  
	  
	 public static void main(String args[]){  
		 
		 polyTest a=new DynamicBinding();  
		 a.eat();  
	 }  
}
