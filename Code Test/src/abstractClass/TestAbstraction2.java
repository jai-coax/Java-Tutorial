package abstractClass;

public class TestAbstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Bike a;
			
			a = new Honda();
			
			a.changeGear();
			a.run();
			
			System.out.println("Rate of Interest is: "+a.getRateOfInterest()+" %"); 
			
			a = new ZMR();
			
			a.changeGear();
			a.run();
			
			System.out.println("Rate of Interest is: "+a.getRateOfInterest()+" %"); 

	}

}
