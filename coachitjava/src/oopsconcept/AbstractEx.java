package oopsconcept;

   abstract class Bike{
	void m1() {
		System.out.println("this is bike");
	}
}
   class Honda extends Bike{
	public void m2() {
		System.out.println("bike,honda is running");
	}
}
 public class AbstractEx {
	public static void main(String[] args) {
		Honda obj=new Honda();
		obj.m2();

	}
}
