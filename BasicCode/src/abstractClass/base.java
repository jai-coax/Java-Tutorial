package abstractClass;

public class base extends Abstrac {

	@Override
	void run() {
		
		System.out.println("test class of abstract extended to normal class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstrac a = new base();
		
		//base a = new base();
		
		a.run();
		a.print();

	}

}
