package ex3_buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInput {
	public static void main(String[] args) {
		FileInputStream in = null;
		BufferedInputStream bis = null;
		
		try {
			in = new FileInputStream("text.txt");
			bis = new BufferedInputStream(in);
			
			int code = 0;
			while((code = bis.read()) != -1) {
				System.out.println((char)code);
			}
			
			in.close();
			bis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
