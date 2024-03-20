package ex2_value;

public class Ex2_Variable {
	public static void main(String[] args) {
		
		//논리형 변수
		boolean b1 = true;
		System.out.println(b1);
		
		//TypeMissmatch
		//boolean b2 = 1;
		
		//----------------------------------
		//문자형
		char c='A';
		System.out.println(c);
		
		//----------------------------------
		//정수형
		//byte b2 = 128;
		
		byte b2 = 127;
		short s = 32767;
		int i =550;
		
		System.out.println(b2);
		System.out.println(s);
		System.out.println(i);
		
		//----------------------------------
		//실수형
		float f1,f2;
		
		//java에서 실수의 타입은 기본적으로
		//double형으로 인식하기 때문에
		//float 자료형을 사용한다는 것을 명시해줘야 함
		f1=3.14f;
		f2=1.23f;
		
		System.out.println(f1);
		System.out.println(f2);
		
		int myAge = 20; //myAge에 20을 저장
		int yourAge = myAge; //myAge에 저장된 20이 복사되어 yourAge에 저장된다
		
		System.out.println("myAge="+myAge);
		System.out.println("yourAge="+yourAge);
		
		//------------------------------------
		int su1 = 20;
		int su2 = 30;
		
		System.out.println("변경전");
		System.out.println("su1="+su1);
		System.out.println("su2="+su2);
		 
		int temp;
		temp = su1;
		su1 = su2;
		su2 = temp;
		
		System.out.println("변경후");
		System.out.println("su1="+su1);
		System.out.println("su2="+su2);
	}
}
