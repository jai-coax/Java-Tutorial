package interfaceCode;

interface printable {
	
	void test();
	
	void sam();
	
}

public class sampleinter implements printable {
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("sample code1");
		
	}

	@Override
	public void sam() {
		// TODO Auto-generated method stub
		System.out.println("sample code2");
		
	}
	
	public void sem1() {
		// TODO Auto-generated method stub
		System.out.println("sample code3");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		sampleinter a = new sampleinter();
		
		a.test();
		a.sam();
		a.sem1();
		
	}

	
}
