package interfaceCode;

public class shapeInterface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable a = new Rectangle(); // creating object for interface Drawable and accessing class Rectangle
		
		a.draw();
		
		Drawable b = new Circle();
		
		b.draw();
		
		b.msg();
		
		System.out.println(Drawable.cube(3));
		
	}

}
