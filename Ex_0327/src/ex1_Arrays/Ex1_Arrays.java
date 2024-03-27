package ex1_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex1_Arrays {
	public static void main(String[] args) {
		//배열의 출력
		//toString()
		//반복문의 도움 없이 배열을 출력할 수 있도록 해준다
		//배열에 정의된 값을 문자열(String)형태로 변환하여 출력해준다

		int[] arr = {1,6,3,2,10,4,7,5,9,8};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("-----------------------------");
		//배열의 정렬
		//sort()
		//기본적으로 오름차순으로 정렬]
		System.out.println("정렬전");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("정렬후");
		System.out.println(Arrays.toString(arr));
		
		//내림차순 정렬
		//Comparator.reverseOrder()를 통해서 내림차순으로 정렬이 가능하다
		//하지만 기본자료형 배열로는 불가능하다
		//기본자료형의 클래스타입이 필요한다 이를 Wrapper클래스라고 한다.
		
		//기본자료형의 클래스타입
		//int -> Integer
		//char -> Character
		//float -> Float
		//double -> Double
		//boolean -> Boolean
		
		Integer[] arr2 = {1,6,3,2,10,4,7,5,9,8};
		
		//정렬 후
		Arrays.sort(arr2, Comparator.reverseOrder());;
		System.out.println(Arrays.toString(arr2));
		System.out.println("-----------------------------");
		//베열의 복사
		//자바에서 배열은 한 번 생성하면 길이를 변경할 수 없다
		//따라서 더 많은 데이터를 저장하거나 기존의 배열과 똑같은 배열을
		//새로 만들려면 배열을 복사해야한다
		//복사방법
		//얕은 복사(Shallow Copy)
		//복사된 배열이나 원본 배열이 변경될 때 서로 간의 값이 함께 변경된다
		//깊은 복사(Deep Copy)
		//복사된 배열이나 원본 배열이 변경될 때 서로 간의 바뀌지 않는다.
		System.out.println("얕은 복사");
		int[] arr01 = {1,2,3};
		
		//배열의 얕은 복사
		int[] arr02 = arr01;
		
		arr02[1] =10;
		
		System.out.println(Arrays.toString(arr01));
		System.out.println(Arrays.toString(arr02));
		
		System.out.println("-----------------------------");
		System.out.println("깊은 복사");
		//깊은 복사
		//배열의 깊은 복사는 반복문을 이용해 새로운 배열에
		//값을 직접 넣거나
		//Arrays클래스 또는 System클래스가 가진 기능을 이용한다
		
		int[] cards = {1,6,4,5,3,2};
		int[] newcards = new int[cards.length];
		
		//반복문을 이용한 깊은 복사
		for(int i =0; i<cards.length;i++) {
			newcards[i] = cards[i];
		}
		
		//Arrays클래스를 이용한 깊은 복사
		int[] newcards2 = Arrays.copyOf(cards, cards.length);
		
		newcards[1] =100;
		
		System.out.println("cards 배열 : "+Arrays.toString(cards));
		System.out.println("newcards 배열 : "+Arrays.toString(newcards));
		System.out.println("newcards2 배열 : "+Arrays.toString(newcards2));
		
		
	}

}
