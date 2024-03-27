package ex3_array;

public class Ex2_array {
	public static void main(String[] args) {
		char[] ch = new char[4];
		
		ch[0]='J';
		ch[1]='A';
		ch[2]='V';
		ch[3]='A';
		
		System.out.println(ch);
		
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		int[] iArr = new int[4];
		
		for(int i=0;i<iArr.length;i++) {
			iArr[i] = (i+1)*100;
			System.out.println(iArr[i]);
			
		}
	}
}
