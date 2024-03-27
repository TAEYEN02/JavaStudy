package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		//continue
		//반복문 안에서 continue를 만나게 되면
		//가장 가까운 반복문의 증감식으로 돌아간다.
		
		for(int i = 1; i<=2; i++) {
			for(int j=1; j<=5;j++) {
				if(j%2==0) {
					continue;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
