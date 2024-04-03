package ex3_polymorphism;

public class Samsung extends Computer {

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("SAMSUNG");
	}
}