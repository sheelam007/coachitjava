package Javatest;

public class SumoftheTwoArrayElements {

	public static void main(String[] args) {
		int array1[] = {10, 20, 30, 40, 50};
		int array2[] = {9, 18, 27, 36, 45};
		int array3[]=new int[array1.length];
		for(int i=0; i<array1.length; i++) {
	      array3[i]=array1[i]+array2[i];
		}
		System.out.print("Third Array = ");
    for(int j=0; j<array3.length;j++) {
    System.out.print(array3[j]+" ");
	}
}
}
