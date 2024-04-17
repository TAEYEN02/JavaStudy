package ex1_stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex2_stream {
	public static void main(String[] args) {
		Set<String>set = new HashSet<>();
		set.add("홍길동");
		set.add("존슨");
		set.add("제임스");
		
		Stream<String> stream = set.stream();
		
		stream.forEach(System.out::println);
		//Stream은 Iterator와 비슷한 반복자이지만 차이점이 있다
		//1) 내부 반복자 이므로 처리속도가 빠르고 병렬처리에 효율족아더
		//2) 람다식으로 다양한 요소처리를 정의할 수 있다.
		//3) 중간 처리와 최종 처리를 수행하도록 파이프라인을 형성할 수 있다.
		
		ArrayList<String> names = new ArrayList<>(set);
		
		//다시 대입은 되는데
		stream = names.stream();
		stream.forEach(System.out::println);
		
		//객체의 재사용은 불가능
		stream.forEach(System.out::println);
	}
}
