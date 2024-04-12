package ex5_work;
import java.util.*;
//스캐너를 이용하여 키보드에서 숫자를 입력받고
//ThreadCount클래스를 스레드로 만들어서 입력받은 숫자가 1씩 감소하다가 
//0이 되었을 때 "종료"메세지와 함쎄 프로그램을 종료하세요
public class ThreadCountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		
		ThreadCount tc = new ThreadCount(sc.nextInt());
		tc.start();
	}
}
