package ex1_casting;

public class Ex1_Promotion {
	public static void main(String[] args) {
		//형(타입)변환(casting)
		//자료형 다른 자료형을 변환한다
		//모든 연산은 기본적으로 같은 자료형끼리만 수행
		//따라서 서로 다른 자료형의 연산을 하기 위해서는
		//같은 자료형으로 변환해야 한다.
		
		//promotion(자동형변환)
		//작은 자료형에서 큰 자료형으로 변환할때
		//byte -> short -> int -> long
		//정수형이 실수형으로 변환될 때
		
		double d = 100.5;
		int n = 200;
		d = n;
		
		System.out.println(d);
		
		char c = 'A';
		long l = 100;
		
		l = c;
		
		System.out.println("l = "+l);
	}
}
