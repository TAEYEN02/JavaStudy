package ex1_operator;
import java.util.*;

public class Ex5_Operator {
	public static void main(String[] args) {
		//삼항연산자
		//하나의 조건을 정의하여 조건이 참일때 
		//반환할 값, 조건이 거짓일 떄 반환할 값으 ㄹ
		//갖고있는 연산자
		
		//조건식
		//참과 거짓으로 판별할 수 있는 식
		//비교연산자, 논리연산자
		
		int x = 10;
		int y = 15;
		
		boolean result =  ++x >= y ? true: false;
		System.out.println(result);
		
		int n1 = 10;
		int n2 = 20;
		
		char result2 = (n1 += n1) == n2 ? 'O':'X';
		System.out.println(result2);
		
		//<연산자 우선순위>
		//1. . () 
		//2. !, ~ , ++ ,--
		//3. *, /, %
		//4. +, -
		//5. <<, >>
		//6. <, <=, >, >=
		//7. ==, !=
		//8. &
		//9. ^
		//10. |
		//11. &&
		//12. ||
		//13. ? :
		//14. =, 복합대입연산자
		
		System.out.println("-----------------------");
		
		int a = 10;
		int b = 15;
		
		boolean result3 = ++a >=b || 2+7 <= b && 13 -b >= 0 && (a+=b) - (b%a) > 10;
		/**
		 * 	t||t&&t&&f
		 * 	f
		 */
		System.out.println(result3);
		
		System.out.println("-----------------------");
		/**
		 * 과수원에서 배,사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각
		 * 5,7,5개 입니다.
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고, 
		 * 시간당 과일의 평균 생산 개수를 출력
		 * 평균값을 담는 변수는 float로 할 것
		 */
		
		int Pears = 5;
		int Apple = 7;
		int Orange =5;
		
		int total = Pears+Apple+Orange;
		float avg = (float)total/24;
		
		System.out.println("과수원에서 하루에 생산되는 총 개수: "+total+"개");
		System.out.println("시간당 과일의 평균 생산 개수 : "+avg+"개");
		
		System.out.println("-----------------------");
		
		/**
		 * 농구공을 담기 위해 필요한 상자의 개수를 구하세요
		 * 상자 하나에는 농구공이 5개 들어갈 수 있다
		 * 만약 농구공이 23개라면 몇개의 상자가 필요할까요??
		 */
		
		int ball =25;
		
		int box = ball % 5 ==0 ? ball/5:ball/5+1;
		System.out.println("만약 농구공이 23개라면 몇개의 상자가 필요할까요??"+box);
	
	}

	
}
