package Logics;

import java.util.Scanner;

public class Biggestnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
        int x,y,z;
       x=sc.nextInt();
       System.out.println("x:" +x);
       y=sc.nextInt();
       System.out.println("y:" +y);
       z=sc.nextInt();
       System.out.println("z:" +z);

       if(x>y && x>z)
       {
    	   System.out.println(" x is value is greater than other two numbers");
    	   
       }
       else if(y>z && y>x)
       {
    	   System.out.println("y is grater value");
    	   
       }
       else
    	   System.out.println("z is greater value");
	}

}
