package ex1_innerclass;

class Outer{
	private int val1;
	private static int cnt = 1;
	
	public static class Inner{
		public void info() {
			//System.out.println(val1); 에러
			System.out.println(cnt);
		}
	}
}

public class StaticClassExam1 {	
	public static void main(String[] args) {
		//정적 내부 클래스의 객체 생성
		//외부 클래스의 객체를 생성하지 않아도 선언할 수 있다
		Outer.Inner in = new Outer.Inner();
		in.info();
	}
}
