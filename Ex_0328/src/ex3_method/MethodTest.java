package ex3_method;

import java.util.Arrays;
import java.util.Comparator;

public class MethodTest {
	//두 수를 더해 반환하는 함수 add 작성하기
	public int add(int i, int j) {
		return i+j;
	}
	//1~n까지의 총합을 구해서 출력하는 함수 sum  작성
	
	public void sum(int x,int y) {
		int sum = 0;
		for(x=1;x<=y;x++) {
			sum += x;
		}
		System.out.println("총합:"+ sum);
	}

	//배열의 최대값을 찾는 maxFind 메서드
	public void maxFind(Integer[] arr) {
		
//		//탐색 알고리즘
//		int max = arr[0];
//		for(int x: arr) {
//			if(x>max) max = x;
//		}
		
//		System.out.println("최대값 : "+max);
		
		Arrays.sort(arr,Comparator.reverseOrder());
		
		System.out.println("최대값 : "+arr[0]);
	}
	
	//main에서 반지름을 전달받아 원의 넓이를 구하는 circleArea
	//원의 넓이(반지름 * 반지름 * 3.14)
	public void circleArea(int r) {
		float circleArea = (float) (r*r*3.14);
		System.out.println("원의 넓이 : "+ circleArea);
	}
	
	
	//main에서 반지름의 전달받아 원의 둘레를 구하는 circleRound
	//원의 둘레(2*3.14*반지름
	
	public void circleRound(int r) {
		float result = (float)(2*3.14*r);
		System.out.println("원의 둘레 : "+result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
