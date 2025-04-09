package ex03_FileReader;

import java.io.FileReader;

//text.txt 파일을 만들고 한글, 영어(대문자, 소문자) 섞어서 작성
//text.txt 파일의 내용을 읽어와서
//영어 대문자의 개수, 소문자의 개수를 판별하여 출력하세요
//대문자 : x개
//소문자 : x개

public class Exam01 {
	public static void main(String[] args) {
		String path = "D:\\kimisak\\java\\java_work\\test.txt";
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(path);
			
			int code = 0;
			
			String str ="";
			
			int upper=0;
			int lower=0;
			
			//읽어오기 + 읽어올때 판별하기
			while((code=fr.read())!= -1) {
				//읽어서 담기.
				str += (char)code;
				if((char)code>='a'&&(char)code<='z') {
					lower++;
				}
				if((char)code>='A'&&(char)code<='Z') {
					upper++;
				}
			}		
			System.out.println(str);
			System.out.println("대문자 : " + upper + "개");
			System.out.println("소문자 : " + lower + "개");
			fr.close();
		} catch (Exception e) {

		}
	}
}
