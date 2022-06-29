package Logics;

public class Biggestofthreenumbers {

	public static void main(String[] args) {
		int x=7,y=5,z=9;
		if(x>y && x>z) {
			System.out.println("x is the biggest number:" +x);
		}else if(y>x && y>z) {
			System.out.println("y is the biggest value:"+y);
		}else {
			System.out.println("z is the biggest value:"+z);
		}
	}
}
