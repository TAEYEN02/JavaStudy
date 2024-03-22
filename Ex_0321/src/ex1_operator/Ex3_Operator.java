package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		//논리연산자
		//피연산자를 두개 필요로 하는 연산자
		//피연산자로 논리형데이터만 사용이 가능하다
		
		//A&&B
		//논리곱(AND)
		//A와 B가 둘다 참이면 true, 아니면 false
		
		//A||B
		//논리합(OR)
		//A와 B중 하나라도 true라면 true, 아니면 false
		
		//A!B
		//부정(NOT)
		//A가 참이면 거짓으로, 거짓이면 참으로 연산
		
		int x = 10;
		int y = 20;
		
		boolean result = (x-y)<=5 && y<30;
		System.out.println(result);
		
		//참&&참=참
		//참&&거짓=거짓
		//거짓&&참=거짓
		//거짓&&거짓=거짓
		
		result = (x+10) > 20 || y-10 == 11;
		System.out.println(result);
		
		result =! result;
		System.out.println(result);
		
		System.out.println("--------------------");
		
		//비트연산자
		//논리 연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다
		//& : 논리곱(AND)
		//두 항이 모두 1이면 1, 아니면 0
		//| : 논리합(OR)
		//둘 중 하나라도 1이면1, 아니면 0
		//^ : 배타적논리합(XOR)
		//두항이 다르면 1 , 같으면 0
		//~ : 부정(not)
		//1을 0으로 0을 1로 연산
		
		int a = 10;	//1010
		int b = 7;	//0111
		int c = a&b;//0010
		System.out.println(c);
		
		c = a|b;	//1111
		System.out.println(c);
		
		c= a^b;		//1101
		System.out.println(c);
		
		//not 연산
		//2진수는 음수를 표현할 수 없다
		//그래서 비트의 맨 앞자리는 수의 표현이 아닌
		//부호의 표현으로 쓰기로 약속했다.
		//1이면 음수, 0이면 양수
		
		c= ~b;		//11111000	-> 4byte=8bit	
		System.out.println(c);
		
	}
}
