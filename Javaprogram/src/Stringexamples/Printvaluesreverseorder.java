package Stringexamples;

public class Printvaluesreverseorder {

	public static void main(String[] args) {
		String arr = "naresh";
		String sum = "";
		char arr1[] = arr.toCharArray();

		for (int i = arr1.length - 1; i >= 0; i--) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);
	}
}
