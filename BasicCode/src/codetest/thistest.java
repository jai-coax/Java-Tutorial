package codetest;

public class thistest {
	 void method1(thistest m1){
		 System.out.println(m1);
		    System.out.println("This is method 1");
		}
		  void method2(){
		    method1(this);
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thistest m = new thistest();
	    m.method2();
	}

}
