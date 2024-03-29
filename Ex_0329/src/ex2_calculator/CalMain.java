package ex2_calculator;
//CalTest클래스를 생성하고
//두개의 정수와 산술연산자를 매개변수로 갖는 
//getResult라는 메서드를 정의하기
//main에서 숫자와 산술연산자를 전달하고 확인하기
public class CalMain {
	public static void main(String[] args) {
		CalTest cal = new CalTest();
		
		cal.getResult(3, 4, "*");

	}
}
