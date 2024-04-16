package ex1_filereader;

import java.io.FileReader;
import java.io.IOException;

//test.txt에 아무 내용이나 적는다 한글,영어 대문자 소문자
//섞어서 작성하고 test.txt의 내용을 읽어와서
//영어 대문자와 소문자의 개수를 출력하세요

//대문자 : x개
//소문자 : x개
public class Ex2_FileReader {
	 public static void main(String[] args) {
	        int upper = 0;
	        int lower = 0;
	        try {
	        	FileReader fr = new FileReader("D:\\text");
	            int code = 0;
	            while ((code = fr.read()) != -1) {
	            	if(code>='A'&& code<='Z') {
	            		upper++;
	            	}
	                if (code>='a'&& code<='z') {
	                       lower++;
	                }
	            }
	            
	            fr.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("대문자 : " + upper + "개");
	        System.out.println("소문자 : " + lower + "개");
	    }
	}