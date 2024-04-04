package ex3_try_catch;

public class Ex1_try_catch {
	public static void main(String[] args) {
		//NullPointerException
		//자바에서 가장 빈번하게 발생하는 실행 예외
		//객체가 제대로 생성되지 않은 상태에서 사용할 경우 발생한다
		//우리가 객체를 선언하면 객체는 주소를 가지게 되고,
		//그것을 통해 객체에 접근해 값을 가져온다
		//객체는 정의되었는데 실제 메모리에 생성되지 않았을 경우
		//예외가 발생한다.
		
		String[] strArray = null;
		
		System.out.println("strArry[0]: "+strArray[0]);
	}
}
