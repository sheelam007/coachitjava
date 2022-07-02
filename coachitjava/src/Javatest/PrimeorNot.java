package Javatest;

import java.util.Scanner;

public class PrimeorNot {
      
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number");
		int num=sc.nextInt();
		int count=0;
	      for(int i=1;i<=num; i++) {
	    	  if(num%i==0) {
	    	  //System.out.println(i+" ");
	    	  count++;
	      }
	  }
	if(count==2) {
		System.out.println("Given number is Prime number: True");
	}else {
		System.out.println("given number is not Prime number: False");
	}
   }
 }