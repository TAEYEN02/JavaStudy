package ex7_phone;

public class Person {
	Phone p;

	public Person(Phone p) {
		this.p = p;
	}

	public void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println("= = = = =");
		System.out.println("새 폰을 샀습니다.");
	}

	public void turnOnPhone() {
		p.powerOn();
	}

	public void turnOffPhone() {
		p.powerOff();
	}

	public void watchUtube() {
		if (p.isOn()) {
			p.watchUtube();
		} else {
			System.out.println("폰이 꺼져있기 때문에 U튜브를 볼 수 없습니다");
		}
	}

	public void ChargePhone() {
		p.charge();
	}
}
