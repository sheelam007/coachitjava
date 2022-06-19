package overloading;

public class Person {
	public void talking() {
		System.out.println("hello");
	}
	public void talking(String msg) {
		System.out.println(msg);
	}
	public void talking(String msg,int n) {
		System.out.println(msg);
	}
	public static void main(String[] args) {

	}
}
