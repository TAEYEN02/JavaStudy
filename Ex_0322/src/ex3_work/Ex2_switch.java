package ex3_work;
import java.util.*;

public class Ex2_switch {
	public static void main(String[] args) {
		/**
		 * 키보드에서 2개의 값을 입력받는다
		 * 산술연산자 기호를 문자열로 입력받는다
		 * switch문을 이용하여 정수의 연산을 수행하는
		 * 코드 작성하기
		 */
		
		/**
		 * 예시
		 * 수1:10
		 * 수2:7
		 * 연산자:+
		 * 
		 * 결과
		 * 10 + 7 = 17
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수1:");
		int a = sc.nextInt();
		System.out.print("수2:");
		int b = sc.nextInt();
		System.out.print("연산자:");
		String s = sc.next();
		
		switch(s) {
		case "+":
			System.out.printf("%d + %d = %d",a,b,a+b);
			break;
		case "-":
			System.out.printf("%d - %d = %d",a,b,a-b);
			break;
		case "*":
			System.out.printf("%d * %d = %d",a,b,a*b);
			break;
		case "/":
			System.out.printf("%d / %d = %d",a,b,a/b);
			break;
		}
	}
}
