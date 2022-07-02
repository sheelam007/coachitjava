package superkeyword;
class Animal{
	public void animalSound() {
	System.out.println("The animal makes a sound");
}
}
	class Cat extends Animal{
	   public void animalSound() {
		    super.animalSound(); 
		  System.out.println("The Cat says: maw.. maw..");
		  }
		}
public class Main {
	public static void main(String[] args) {
		Animal obj=new Cat();
		    obj.animalSound(); 
		  }
	  }

