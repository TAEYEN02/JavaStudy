package ex4_inputStreamReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex2_OutputStreamWriter {
	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter is = null;
		
		try {
			out = new FileOutputStream("D:\\outtest.txt");
			is = new OutputStreamWriter(out);
			
			System.out.println("파일 생성 시작");
			
			String[] strArray = {"OutputStreamWriter에 대해 배웁니다 \n",
					"we are learning about OutputStreamWriter"};
			
			for(String s : strArray) {
				is.write(s);
			}
			
			is.close();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
