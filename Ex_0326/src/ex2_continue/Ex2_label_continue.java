package ex2_continue;

public class Ex2_label_continue {
	public static void main(String[] args) {
		int n = 0;
		
		outer:while(true) {
			if(n>=10) {
				break;
			}
			while(true) {
				n++;
				if(n%3==0) {
					System.out.println("continue를 만남");
					continue outer;
				}
				System.out.println(n);
			}
		}
		
	}
}
