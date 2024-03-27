package ex1_break;

public class Ex3_switch_break {
	public static void main(String[] args) {
		//switch속에 break;
		int n =0;
		
		w:while(n<10) {
			n++;
			switch(n) {
			case 1: 
				System.out.println("switch문 1번 거쳐감");
				//기본적으로 switch문의 break는
				//switch문을 빠져나간다
				break w;
				//label을 달면 반복문을 빠져나갈 수 있다.
			case 2: 
				System.out.println("switch문 2번 거쳐감");
				continue; 	//switch문만 단독으로 사용할 때는 continue를 쓸 수 없음
			}
			System.out.println(n);
		}
	}
}
