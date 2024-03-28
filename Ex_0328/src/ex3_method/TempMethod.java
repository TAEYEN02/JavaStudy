package ex3_method;
import java.util.*;
public class TempMethod {
	//main에서 섭씨로 변환하고 싶으면 1, 화씨로 변화하고 싶으면 2를 변환받고
	//fahrenheitToCelsius 함수를 통해 화씨를 섭씨로 바꾸기 위한 온도를 입력받고,
	//celsiusToFahrenheit 함수를 통해 섭씨를 화씨로 바꾸기 위한 온도를 입력받고
	//출력하는 프로그램
	
	//화씨 = 1.8*섭씨 + 32, 섭씨 = (화씨 -32)/1.8
	public void start() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.print("1을 누르면 화씨에서 섭씨\n2를 누르면 섭씨에서 화씨로 변경 :");
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			fahrenheitToCelsius(sc);
			break;
		case 2:
			celsiusToFahrenheit(sc);
			break;
		}
	}
	
	
	public void fahrenheitToCelsius(Scanner sc) {
		double cel;
		double faher;
		
		System.out.print("화씨를 입력하세요 : ");
		faher =sc.nextInt();
		cel = 1.8*faher;
		System.out.println("섭씨 :"+cel);
	}
	
	public void celsiusToFahrenheit(Scanner sc) {
		double cel;
		double faher;
		
		System.out.print("섭씨를 입력하세요 : ");
		cel =sc.nextInt();
		faher = cel*1.8+32;
		System.out.println("화씨 :"+faher);
	}
	
}
