package Javatest;

public class Overloading {
       public void m1() {
    	   System.out.println("no-aggument");
       }
       public void m1(int i) {
    	   System.out.println("with int argument");
       }
       public void m1(double d) {
    	   System.out.println("with double argument");
       }
	public static void main(String[] args) {
		Overloading o=new Overloading();
		// o.m1();
		o.m1(10);
		//o.m1(23.5);

	}

}
