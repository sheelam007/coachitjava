package Javatest;

public class ThisExample{
	int x;
   public ThisExample(int x){
	this.x=x;
}
	public static void main(String[] args) {
		ThisExample p= new ThisExample(6);
		System.out.println(p);
	}
	 
}
