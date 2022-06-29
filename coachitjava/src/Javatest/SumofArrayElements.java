package Javatest;

public class SumofArrayElements {

	public static void main(String[] args) {
	  int a[]= {10,30,50};
	  int sum=0;
	  for(int i=0; i<a.length; i++) {
		  sum=sum+a[i];
	  }
       System.out.println("sum:" +sum);
	}

}
