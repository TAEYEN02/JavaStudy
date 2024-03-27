package ex1_break;

public class Ex2_label_break {
	public static void main(String[] args) {
		//일반적인 기타제어문은 하나의 반복문만 이동하게 해준다
		//break, continue에 라벨을 달아서 내가 원하는 반복문을
		//빠져나가거나,이동할 수 있게 해준다
		
		//label은 항상 쌍으로 존재한다
		//label의 이름은 원하는대로 사용이 가능하다
		
		//label은 자신을 포함하고 있는 상위 개념에게만 달 수 있다
		
		happy:for(int i =1;i<=3;i++) {
			for(int k = 1; k<=10; k++) {
				System.out.print(k+" ");
			}
			for(int j=1;j<=10;j++) {
				if(j%2==0) {
					break happy;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
