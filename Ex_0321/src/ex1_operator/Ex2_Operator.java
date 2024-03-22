package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		//대입연산자
		//우측의 값을 좌측에 대입한다
		
		int n1=10;
		int n2=7;
		
		System.out.println("n1="+n1+", n2="+n2);
		
		//복합대입연산자
		//산술연산자와 대입연산자가 합쳐진형태 +=,-=,*=,%=
		
		int x = 5;
		int y = 7;
		
		y+=x;	//y=y+x
		System.out.println("y="+y);
		
		y*=x;	//y=y*x
		System.out.println("y="+y);
		
		y%=x;	//y=y%x
		System.out.println("y="+y);
		
		System.out.println("---------------------");
		
		//관계(비교)연산자
		//변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		//네->true,아니오->false
		
		x=10;
		y=20;
		boolean result=x<y;	//왼쪽에 있는게 기준 -> (코드 : x가 y보다 작다)
		System.out.println(result);
		
		result = x==y;
		System.out.println("x==y:"+result);
		
		result = x != y;
		System.out.println("x!=y:"+result);
		
		
		
		
		
	}
}
