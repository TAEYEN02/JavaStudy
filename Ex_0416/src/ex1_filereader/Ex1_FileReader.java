package ex1_filereader;

import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("");
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.println((char)code);
			}
			fr.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
