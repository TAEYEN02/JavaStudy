package ex3_polymorphism;

public class LZ extends Computer{
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("LZ");
	}
}
