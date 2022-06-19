package polymorphism;

public class Test {
	public static void main(String[] args) {
		Car maruthiCar = new MaruthiCar();
		Car tataCar=new TataCar();
		maruthiCar.raiding();
		tataCar.raiding();
	}
}
