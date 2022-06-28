package Equalsmethods;

public class DoubleEquales {

	public static void main(String[] args) {
		//create string
				String s1 = "sandhya";
				String s2 = "sandhya";
				System.out.println(s1 == s2);//double euales is Address comparision.
		//equals();
		      System.out.println(s1.equals(s2));
		       //2n way to create string
				String s3=new String("ramesh");
				String s4=new String("ramesh");
				System.out.println(s3 == s4);
				//equals();
				System.out.println(s3.equals(s4));
	}
}
