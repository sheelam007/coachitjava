package Starspattern;

public class Polindrome {

	public static void main(String[] args) {
	    int rem,rev=0;
		int number=12321;
		int temp=number;
		while(temp!=0) {
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		if(rev==number) {
			System.out.println("given number is polyndrome:"+"true");
		}else {
			System.out.println("given number is not a polyndrome"+"false");
		}
	}
}
