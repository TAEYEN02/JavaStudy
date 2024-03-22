package ex1_operator;

public class Ex4_Operator {

	public static void main(String[] args) {
		//증감연산자
		//1씩 증가시키서나 1씩 감소시키는 연산자
		//++ , --
		
		//선행증감연산자
		//변수의 앞에서 사용한다.
		int a = 10;
		System.out.println("a : "+ ++a);
		
		//후행증감연산자
		//메모리에는 증가하지만 연산은 나중에 된다.
		//출력을 먼저하고 증가를 나중에
		//따라서 다음 줄에 출력을 한다면 1증가한 상태로 출력
		int b = 10;
		System.out.println("b : "+ b++);
		System.out.println(b);
		
		int x =5;
		
		int y =7;
		
		int z = x+y++;
		
		//연산을 모두 마치고 x,y,z의 값은 각각 무엇인가
		//x=5
		//y=8
		//z=12
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x=8;
		y=3;
		z=x++ + --y -   ++x + --x + y++;
		System.out.println(z);
		
	}

}
