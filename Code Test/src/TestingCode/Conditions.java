package TestingCode;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1,x2;
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter Value for x1:" );
		
		x1=a.nextInt();
		
		System.out.println("Enter Value for x2:" );
		
		x2=a.nextInt();
		
		int large = x1;
		
		/*if(x2 > large)
		{
			
			large = x2;
			//System.out.println("Large Number is: \n" + large );
		}
		
		System.out.println("Large Number is: \n" + large );*/
		
		
		if(x2 > large)
		{
			
			large = x2;
			System.out.println("Large Number is: \n" + large );
		} else if(x2 == large) {
			
		System.out.println("both are equal: \n" + large ); 
		} else {
			
			System.out.println("Large Number is: \n" + large );
		}
		
		
		
		
		

	}

}
