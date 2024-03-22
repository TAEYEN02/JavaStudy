package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		
		//switch문의 비교값으로 사용할 수 있는 자료형
		//1) 정수(byte, short, int)
		//2) 문자형(char)
		//3) 문자열(String)
		
		char c = '홍';
		String result = null;
		
		switch(c) {
		case '박':
			result = "박길동";
			break;
		case '이':
			result = "이길동";
			break;
		case '김':
			result = "김길동";
			break;
		case '홍':
			result = "홍길동";
			break; //switch문을 빠져나가는 역할
		}
		System.out.println(result);
		
		System.out.println("--------------------");
		
		//만약 switch문에 break가 없다면 어떻게 될까
		//조건에 맞는 case를 시작으로 뒤따라오는 모든 case구문이 실행된다
		//따라서 개발자는 break; 키워드를 적절하게 이용할 수 있어야 한다.
		int num=1;
		switch(num) {
		case 1:
			System.out.println("num 1입니다");
		case 7:
			System.out.println("num 7입니다");
		default:
			System.out.println("num은 1도 7도 아닙니다");
		}
		
		//1~9까지 짝수면 짝수입니다, 홀수면 홀수입니다
		int i = 3;
		switch(i) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(i+"는 홀수입니다");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println(i+"는 찍수입니다");
			break;
		}
	}
}	
