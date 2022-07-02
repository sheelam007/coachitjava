package logics;

import java.util.Scanner;

public class PrimeNumber {
	public static String primeOrNot(int n) {
		boolean status = true;
		String statuss;
		if(n<=1) {
			status=false;
		}
		if (n == 2) {
			status = true;
		} else if (n >= 3) {
			for (int i =2; i <n; i++) {
				if (n % i == 0) {
					status = false;
					break;
				}
			}
		}
		if (status) {
			statuss="Given Number " + n + " is a Prime";

		} else {
			statuss="Given Number " + n + " is Not Prime";
		}

		return statuss;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for checking prime: ");
		int n = sc.nextInt();
		System.out.println(primeOrNot(n));

	}
}
