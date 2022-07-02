package logics;

import java.util.Scanner;

public class Pattern1to14numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n number:");
		int n=sc.nextInt();
		int num=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(num);
				num=num+1;
			}
			    System.out.println();
		}

	}

}
