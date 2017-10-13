package TestingCode;

public class thiskeyword {
	
	int id = 1;
	String name = "test";
	
	thiskeyword(){
		
		//id = id;
		//name = name;
		this.id = 2;
		this.name = "jai";
		//System.out.println(id + " "+ name);	
	}
	void display() {
		
		System.out.println(id + " "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thiskeyword a = new thiskeyword();
		
		a.display();
		

	}

}
