package coachitexceptions;

import java.io.FileNotFoundException;

public class Exceptionmultiplecatch {

	public static void main(String[] args) {
		System.out.println("this is try and multiple catch");
		try{
			System.out.println(10/0);
		}
         catch(ArithmeticException e) {
			
		}
         catch(ArithmeticException e)
		{
			
		}
		
		

	}

}
