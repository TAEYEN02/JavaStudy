package ex1_break;
import java.util.*;

public class Ex1_break {
	public static void main(String[] args) {
		//기타제어문
		//일반적으로 조건식의 검사를 통해서 반복문에 진입하게 되면
		//다음 조건식을 검사하기 전까지 반복문 안에있는 모든 명령을 실행한다
		//기타제어문을 통해 반복문의 흐름 자체를 제어할 수 있다
		
		//기타제어문의 종류
		//break, continue
		
		//break
		//반복문 내에서 break를 만나게 되면, 가장 가까운 반복문을 
		//종료하고 다음 코드를 실행하게 된다.
		
		//기타제어문은 반복문 안에서만 작성해야된다
		//기타제어문 밑에는 어떠한 코드도 올 수 없다.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수입력(-1 입력시 종료): ");
			int n = sc.nextInt();
			
			if(n==-1) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
