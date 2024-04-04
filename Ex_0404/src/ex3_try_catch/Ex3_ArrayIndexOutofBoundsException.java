package ex3_try_catch;

public class Ex3_ArrayIndexOutofBoundsException {
	public static void main(String[] args) {
		//ArrayIndexOutofBoundsException
		//배열에서 인덱스(index)범위를 초과해 사용할 때 발생
		
		int[] arr = {1,6,7,8,10};
		System.out.println(arr[5]);
	}
}
