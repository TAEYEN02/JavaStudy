package ex1_stream;

import java.util.Arrays;

public class Ex3_stream {
	public static void main(String[] args) {
		int num[] = {1,44,33,21,35,68,99,5,4,6,1,1,1,2,2,3};
		Arrays.stream(num).distinct().sorted().limit(5).forEach(System.out::print);;
		
		System.out.println();
		
		//원본 array값은 변하지 않는다.
		System.out.println(Arrays.toString(num));
	}
}
