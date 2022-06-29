package Flowcontrol;

import java.util.Scanner;

 public class Patternexample {

	public static void main(String[] args) {
		
		System.out.println("enter the x,n values");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++) 
		{
			for(int j=5; j>=0; j--) {
				
				System.out.print("A");
			}
			
				System.out.println();
		}
	      
	}
 }


