package polymorphism;

public class InstanceInitializerBlock {
	
	//Instance Initializer block is used to initialize the instance data member. 
	//It run each time when object of the class is created.
	
	//The initialization of the instance variable can be directly but 
	//there can be performed extra operations while initializing the instance variable 
	//in the instance initializer block.
	
	//There are three places in java where you can perform operations: method, constructor and block
	
    int speed;  
    
    InstanceInitializerBlock(){
    	
    	System.out.println("constructor is invoked" + " " +speed);
    	
    }  
   
    {
    	System.out.println("instance initializer block invoked");
    	
    }  
	
    {
    	speed =100;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInitializerBlock b1= new InstanceInitializerBlock();  

	}

}