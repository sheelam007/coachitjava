package logics;

import java.util.Scanner;

public class patternstarexample {

	public static void main(String[] args) {
		System.out.println("Enter Number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n / 2;
		System.out.println(m);
		for (int i = 1; i <= n; i++) {

			if (i <= m + 1) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = i; j <= n; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println();
	}
}
