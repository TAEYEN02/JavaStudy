package ex4_try_catch;
//문제
//키보드에 정수를 입력받도록 하고, 정수 이외의 값이 입력되면 
//"정수만 입력가능"이라는 메세지 출력하기
//정수:100
//입력받은 수: 100

//정수: aaa
//결과 : aaa는 정수가 아닙니다
import java.util.Scanner;

public class Ex4_try_catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		try {
			int i = sc.nextInt();
			System.out.print("입력받은수 :" + i);
		} catch (NumberFormatException e) {
			System.out.println("결과 :"+i+"는 정수가 아닙니다");
		}
		System.out.println();
	}
}
