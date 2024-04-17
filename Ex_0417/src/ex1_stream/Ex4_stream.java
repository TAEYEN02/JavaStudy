package ex1_stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex4_stream {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("제임스");
		list.add("존슨");
		list.add("왓슨");
		list.add("스미스");
		
		//Collectors는 스트림을 List,Set으로 변경하는 클래스
		//toCollection()을 이용하여 좀 더 특정한 컬렉션으로 구현이 가능하다
		ArrayList<String> list1 = list.stream().sorted().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list1);
		
		
		
	}
}
