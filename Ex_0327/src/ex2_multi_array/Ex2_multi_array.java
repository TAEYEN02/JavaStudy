package ex2_multi_array;
import java.util.*;

public class Ex2_multi_array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}};
		int res = 0;
		int sum =0;
		
		//1. 총합
		for(int i = 0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
				res++;
			}
		}
	
		//2.평균
		double avg = (double)sum/res;
		
		System.out.println(sum);
		System.out.println(avg);
		
		System.out.println("--------------------------");
		
		/**
		 * 학생들의 수학과 영어성적을 등록하는 프로그램이 있다
		 * 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받은 후, 
		 * 입력받은 수 만큼 학생들의 이름과 수학,영어 성적을 입력하는 프로그램 작성 */
		
		/**
		 * 예시
		 * 등록할 인원 수 :2
		 * 이름:ㄱ
		 * 수학:11
		 * 영어:11
		 * ------------
		 * 이름:ㄴ
		 * 수학:22
		 * 영어:22
		 * --------------
		 * 2명 등록 완료 
		 * ㄱ 11 11
		 * ㄴ 22 22*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 인원 수 : ");
		int str = sc.nextInt();
		
		String[][] arr2 = new String [str][3];
		
		for(int i = 0; i<arr2.length;i++) {
	
			System.out.print("이름 :");
			arr2[i][0] = sc.next();
				
			System.out.print("수학 : ");
			arr2[i][1]= sc.next();
				
			System.out.print("영어 : ");
			arr2[i][2] = sc.next();
				
			System.out.println("-------------------");
		}
		System.out.println(arr2.length+"명 등록 완료");
		for(int i = 0; i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				
				System.out.print(arr2[i][j]+" ");
		
			}
			System.out.println();
		}
	}	
}
