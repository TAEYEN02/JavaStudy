package ex4_person;

public class Person {
	String name;
	int age;
	
	//임의로 새로운 생성자를 정의한 순간부터 기본생성자는 쓸 수 없다.
	public Person(String n, int a) {
		name = n;
		age =a;
	}
	
	//기본 생성자를 사용하고 싶으면 직접 정의해야 한다.
	public Person() {
		
	}
}
