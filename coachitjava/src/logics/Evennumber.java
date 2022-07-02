package logics;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the x value:");
	 int x=sc.nextInt();
	 
	
	
		if(x%2==0)
		{
			System.out.println("given number is even number:"+x);
		}
		else 
		{
			System.out.println("given number is odd number:"+x);
		}
	}

}
