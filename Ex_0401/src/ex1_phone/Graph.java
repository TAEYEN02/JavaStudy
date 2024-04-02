package ex1_phone;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		int[] num = new int[100]; //난수를 담을 배열
		int[] count = new int[10];//발생한 난수가 각각 몇개인지 개수를 저장할 배열

		//0~9사이의 난수를 100개를 뽑는다
		for (int i = 0; i < num.length; i++) {
			//0부터 9사이의 난수를 100번 뽑아서 num 배열에 집어넣음
			System.out.print(num[i] = new Random().nextInt(10));
		}

		for (int i = 0; i < num.length; i++) {
			count[num[i]]++;
		}
		PrintGraph pg = new PrintGraph();
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "의 개수 : " + pg.print('#', count[i]) + " " + count[i]);

		}

	}
}
