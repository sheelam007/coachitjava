package oopsconcept;
 class Parent{
	 void bike() {
		 System.out.println("hero");
	 }
 }
 class Child extends Parent{
	 void cycle() {
		 System.out.println("Atluse");
	 }
 }
public class Inheritance {

	public static void main(String[] args) {
		Child obj=new Child();
           obj.bike();
           obj.cycle();
	}
}
