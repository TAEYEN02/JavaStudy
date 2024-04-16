package ex5_enum;

import java.util.Arrays;

public class Ex1_Enum {
	public static void main(String[] args) {
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		//열거형의 순서 반환해보기
		for(Item item : items) {
			System.out.println("name=" +item.name()+", ordinal = "+item.ordinal());
		}
		
		Item i1 = Item.START;
		System.out.println(i1);
		Item i4 = Item.EXIT;
		System.out.println(i1 == i4);
		
		//열거형 데이터 비교 특징
		//열거형 상수간의 비교에는 ==만 사용할 수 있다.(상수의 주소를 비교)
		//<, > 과 같은 비교연산자는 사용할 수 없고 compareTo()는 사용이 가능하다
		
		int res = i4.compareTo(i1);
		System.out.println(res);
		
		switch (i1) {
		case START:
			System.out.println("게임시작");
			break;
		case STOP:
			System.out.println("게임멈춤");
			break;
		case EXIT:
			System.out.println("게임종료");
			break;
		}
	}
}
