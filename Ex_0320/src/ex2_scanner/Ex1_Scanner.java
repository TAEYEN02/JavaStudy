package ex2_scanner;

import java.util.Scanner;

public class Ex1_Scanner{
	//데이터의 입력
	//키보드를 통해 다양한 데이터를 자유롭게 입력하는 방법
	//키보드를 통해 입력하는 데이터를 문자열로 얻기 위해서는
	//'java.util'패키지에 있는 Scanner클래스를 사용해야 한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		//객체에서 기능은 함수 형태로 저장된다
		//우리는 기능을 사용하기 위해 함수를 호출하면 된다
		
		//정수
		//nextByte() : 입력받은 값을 byte형으로 반환
		//nextShort() : 입력받은 값을 short형으로 반환
		//nextInt() : 입력받은 값을 int형으로 반환
		
		//실수
		//nextFloat() : 입력받은 값을 float형으로 반환
		//nextDouble() : 입력받은 값을 double형으로 반환
		
		//문자열
		//nextLine() : 입력받은 줄 전체를 문자열로 반환 enter 누르면 끝
		//next() : 입력받은 값을 문자열 타입으로 저장 spacebar 누르면 끝
		
		//System.out.println(sc.nextInt());
		//System.out.print("나이를 입력해 주세요 : ");
		//int age = sc.nextInt();
		//System.out.println("나이: "+age);
		
		//이름,나이,주소,키를 키보드에서 입력받고
		//name, age, address, height라는 변수에 저장한 후 
		//다음과 같이 출력해주세요
		
		//당신의 이름은 홍길동 입니다
		//당신의 나이는 20살 입니다
		//당신의 주소는 인천시 부평구 입니다
		//당신의 키는 195.4cm입니다
		
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.print("주소:");
		String address = sc.next();
		sc.nextLine();
		
		System.out.print("키:");
		double height = sc.nextFloat();
		
		System.out.printf("당신의 이름은 %s 입니다\n",name);
		System.out.printf("당신의 나이는 %d살 입니다\n",age);
		System.out.printf("당신의 주소는 %s 입니다\n",address);
		System.out.printf("당신의 키는 %.1fcm입니다",height);
	}
}
