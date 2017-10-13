package TestingCode;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1,x2,ch;
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter Value for x1:" );
		x1=a.nextInt();
		
		System.out.println("Enter Value for x2:" );
		x2=a.nextInt();
		
		System.out.println("Enter the number to do action: \n 1 For Add ,2 For Sub ");
		System.out.println("Enter your choice");
		ch=a.nextInt();
		
		double test;
		
		switch(ch)
		{
			case 1:
			test = x1 + x2;
			System.out.println("Addtion Happen:" + test);
			break;
			
			case 2:
			test = x1 - x2;
			System.out.println("Sub Happen:" + test);
			break;
			
			default:
			System.out.println("Enter the valid number");
			
		}
		

	}

}
