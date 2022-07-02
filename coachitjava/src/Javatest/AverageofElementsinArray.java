package Javatest;

public class AverageofElementsinArray {

	public static void main(String[] args) {
		int a[]= {10,30,40,60,70};
		int sum=0;
	  for(int i=0;i<a.length; i++) {
			sum=sum+a[i];
		}
	    System.out.println("Sum of Elements:"+sum);
        int Avg=sum/a.length;
        System.out.println("Avg of Elements:"+Avg);
	}
	    
}
