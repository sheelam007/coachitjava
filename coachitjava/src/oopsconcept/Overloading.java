package oopsconcept;

public class Overloading {
	   public void print(int num) {
		System.out.println("First print method");
		  System.out.println("int:"+num);
	}
	   public void print(double num) {
		   System.out.println("second print method");
			System.out.println("double:"+num);
	}
	   public void print(String text) {
		   System.out.println("String print method");
			System.out.println("string:"+text);
	}

  public static void main(String[] args) {
	  Overloading p=new Overloading();
	    p.print(10);
	    p.print(10.35);
	    p.print("12335");
	}
}
