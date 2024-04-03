package ex4_farm;
//추상클래스
//추상메서드가 한 개 이상 정의되어 있는 클래스
//추상 메서드를 포함하고 있다는 것을 제외하고 일반 클래스와 다르지 않다.
//추상 클래스에도 생성자가 있으며, 멤버변수와 메서드도 가질 수 있다.
abstract class Animal {
	//추상 메서드
	//선언부만 작성하고 구현부는 작성하지 않고 남겨둔 미완성 메서드
	public abstract void cry();
};

class Pig extends Animal {
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}

class Cow extends Animal {
	@Override
	public void cry() {
		System.out.println("음메");
	}
}

class Farm {
	public void sound(Animal animal) {
//		if (animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		} else {
//			System.out.println("음메");
//		}
		animal.cry();
	}
}

//instanceof연산자
//부모 타입으로 타입이 변환되어 저장된 변수는 안에 어떤 객체가 담겨있는지
//직접 확인하지 않는 이상 내부 객체가 뭔지 알기 쉽지 않다
//오버라이딩된 메서드가 있다면 확인이 쉽겠지만, 부모클래스를 같이 상속받고
//있는 클래스 또는 부모클래스와 구별할 수 있는 특정 멤버가 없으면
//어떻게 구별해야할까??

//A instanceof B : A 객체가 생성될 때 B타입으로 생성되었는지 확인
//맞으면 true, 아니면 false로 반환

public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();

		f.sound(p);
		f.sound(c);
	}
}
