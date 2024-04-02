package ex3_inheritance;

public class SchoolBus extends Bus{

	public SchoolBus(int peopleNum) { //버스의 생성자가 메개변수를 가지니깐 상속받으려는 버스의 생성자를 먼저 가져와야하니깐
		super(peopleNum);
	}
	@Override
	public void takePerson() {
		super.takePerson();
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다");
	}
	@Override
	public void ride() {
		super.ride();
		System.out.println("시속 50km/h로 천천히 달립니다.");
	}
	
}