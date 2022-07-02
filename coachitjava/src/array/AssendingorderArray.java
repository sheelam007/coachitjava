package array;

import java.util.Arrays;

public class AssendingorderArray {

	public static void main(String[] args) {
		int arr1[]= {-1,3,5,-6,-6,9,-3};
		Arrays.sort(arr1);
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
