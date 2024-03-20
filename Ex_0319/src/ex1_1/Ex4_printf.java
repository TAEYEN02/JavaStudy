package ex1_1;

public class Ex4_printf {
	public static void main(String[] args) {
		//printf
		//값의 타입에 따라 서식 문자를 이용해
		//문자열 속에서 데이터를 출력할 수 있다
 
		//실행 ctrl+f11
		System.out.println(2+"+"+2+"="+4);
		System.out.printf("%d+%d=%d\n",2,2,2+2);
		
		//서식 문자의 종류
		//%d : 정수(10진수)
		//%o : 정수(8진수)
		//%x : 정수(16진수)
		//%f : 실수
		//%s : 문자열
		//%c : 문자형
		//%b : 논리형
		
		System.out.printf("저는 %d살 입니다 \n",20);
		
		//출력값의 정렬
		//%3d, %5d -> 주어진 숫자만큼 칸을 확보하고
		//오른쪽 정렬하여 출력
		System.out.printf("%5d\n",12);
		
		System.out.printf("%.1f\n",1.23456);
		System.out.printf("%.2f\n",1.23456);
		System.out.printf("%.3f\n",1.23456);
	}
}
