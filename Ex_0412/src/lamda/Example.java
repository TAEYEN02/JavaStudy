package lamda;
import java.util.*;

public class Example {
	public static void main(String[] args) {
		ArrayList<Integer>list2 = new ArrayList<>();
		for(int i = 1; i<=10; i++) {
			list2.add(i);
		}
		//removeIf(Predicate filter)
		//조건에 맞는 값들을 삭제
		list2.removeIf(x->{return x %2 ==0;});
		System.out.println(list2);
	}
}
