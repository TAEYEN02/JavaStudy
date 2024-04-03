package ex3_polymorphism;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		cr.com1 = new LZ();
		cr.com2 = new Samsung();
		cr.allPowerOn();
		cr.allPowerOff();
	}

}