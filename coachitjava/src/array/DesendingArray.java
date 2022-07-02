package array;

import java.util.Arrays;

public class DesendingArray {
	
	public static void main(String[] args) {
	   int arr[]= {-1,3,5,-6,-6,9,-3};
	   Arrays.sort(arr);
	   for(int i=arr.length-1; i>=0; i--) {
		   System.out.print(arr[i]+" "); 
	   }
	}
}
