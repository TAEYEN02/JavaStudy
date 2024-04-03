package ex6_phone;

abstract public class Phone {
	abstract public void openingLogo();
	
	
	public void powerOn() {
		openingLogo();
		System.out.println("핸드폰이 켜집니다");
	}
	public void powerOff() {
		System.out.println("핸드폰이 꺼집니다");
	}
}
