package ex5_abstract;

public class AbsMain {
	public static void main(String[] args) {
		//추상클래스는 직접 객체를 가질 수 없다
		//AbsParent ap = new AbsParent();
		
		AbsChild a1 = new AbsChild();
		a1.setValue(20);
		System.out.println(a1.getValue());
		
		AbsParent a2 = new AbsChild();
		
	}
}
