package Logics;

import java.util.Scanner;

public class Sumoffirstnnumbers {

	public static void main(String[] args) {
	    System.out.println("enter the input values:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    int sum=0;
		
		for(int i=1;i<=n;i++) 
		{
			sum+=i;
		}
		
		System.out.println("sum of five numbers:"+sum);
	}

}
