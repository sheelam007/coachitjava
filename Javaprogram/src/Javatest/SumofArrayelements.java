package Javatest;

public class SumofArrayelements {

	public static void main(String[] args) {
		int array[] = {10, 20, 30};
		int sum=0;
		for(int i=0; i<array.length; i++) {
			
			sum=sum+array[i];
		}
		
		System.out.println("Sum of array elements 10+20+30="+ sum);

	}

}
