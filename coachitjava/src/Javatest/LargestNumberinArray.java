package Javatest;

public class LargestNumberinArray {

	public static void main(String[] args) {
		int array[]= {10,5,-15,20,-30};
		int large=array[0];
		for(int i=1; i<array.length; i++) {
			if(array[i]>large) {
				large=array[i];
			}
		}
		System.out.println("Largest Element in Array:"+large);
	}

}
