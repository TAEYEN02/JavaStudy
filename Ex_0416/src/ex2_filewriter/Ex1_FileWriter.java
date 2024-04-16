package ex2_filewriter;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("D:\\fileWriter예제");
			
			fr.write("첫번째 줄 작성하기\n");
			fr.write("두번째 줄 작성하기\n");
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
