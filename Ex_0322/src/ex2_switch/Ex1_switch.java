package ex2_switch;
import java.util.*;

public class Ex1_switch {
	public static void main(String[] args) {
		//if문과 비슷하지만 if문은 조건식을 통해서
		//실행하지 않을지 결정을 한다.
		//switch문은 인자값으로 조건이 아닌 값이 들어가야 한다
		
		//기본형
		//switch(비교값){
		//case 조건값:
		//	비교값과 조건값이 일치할 때 실행할 명령;
		//	break;
		//case 조건값:
		//	비교값과 조건값이 일치할 때 실행할 명령;
		//	break;
		//case 조건값:
		//	비교값과 조건값이 일치할 때 실행할 명령;
		//	break;
		//default:
		// 비교값과 조건값이 하나도 일치하는게 없을 때 실행할 명령;
		// break;
		//}
		
		//중복되는 조건값을 가질 수 없다.
		//조건값과 비교값의 타입은 반드시 일치해야 한다.
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("1.게임하기");
			break;
		case 2:
			System.out.println("2.게임설정");
			break;
		case 3:
			System.out.println("3.게임종료");
			break;
		}
		
		//if vs switch
		//둘 다 조건에 따라서 명령을 실행하는 것은 맞지만
		//if문은 범위에 따라서 조건을 비교하는데 효과적이고
		//switch문은 하나의 값에 따라서 조건을 비교하는데 효과적이다.
		
		
		
		
	}
}
