package ex1_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_stream {
	public static void main(String[] args) {
		String[] strArray = {"홍길동","제임스","스미스"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(x -> System.out.print(x+","));
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		
		intStream.forEach(x -> System.out.print(x+","));
		System.out.println();
	}
}
