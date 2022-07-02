package oopsconcept;
 class Employee{
	 private String name;
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getName() {
		 return name;
	 }
 }
public class Encapsulation {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("sandhya");
		System.out.println("Name is:"+e.getName());
	}
}
