package ex3_work;
import java.util.*;

public class Ex1_if {
	public static void main(String[] args) {
		/**
		 * 키보드에서 값을 입력받아
		 * 짝수면 X는 짝수입니다.
		 * 홀수면 X는 홀수입니다
		 * 를 If문을 사용해서 작성하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int i = sc.nextInt();
		if(i%2==0) {
			System.out.println(i+"는 짝수입니다");
		}else {
			System.out.println(i+"는 홀수입니다");
		}
		
		System.out.println("-----------------");
		/**
		 * 국어, 영어, 수학 점수를 입력받고
		 * 한 과목이라도 40점을 넘지 못하면
		 * 불합격을 출력하고 
		 * 세 과목 모두 40점을 넘으면 합격을 출력하세요
		 */
		System.out.print("국어 점수: ");
		int kor= sc.nextInt();
		System.out.print("수학 점수: ");
		int math = sc.nextInt();
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		
		if(kor>=40 && math>=40 && eng >=40) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
	}
}
