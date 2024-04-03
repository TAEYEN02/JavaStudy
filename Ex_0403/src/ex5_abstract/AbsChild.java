package ex5_abstract;

public class AbsChild extends AbsParent {
	//추상클래스를 상속받은 자식 클래스는
	//부모가 가지고 있는 추상 메서드를 무조건 받아줘야 한다.
	
	@Override
	public void setValue(int n) {
		System.out.println("추상메서드 재정의함");
	}

}
