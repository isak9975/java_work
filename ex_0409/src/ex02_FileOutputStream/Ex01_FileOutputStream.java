package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_FileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			//경로에 파일이 없으면 파일을 만들어준다.
			//write를 한 내용까지 작성을 해준다.
			//세이브파일을 만든다거나 저장하는 문서를 만드는 경우 FileOutputStream이 사용된다.
			//확장자도 마음대로 지정할 수 있다.
			
			//바이트배열 -> 문자열 new String(byte[] b);
			//문자열 -> 바이트배열
			
			//삼중따옴표문법은 Java 15부터 사용할 수 있다.
			//텍스트 블록이라고 부르며 여러 줄에 걸친 문자열을 작성할때 사용된다.
			//줄 끝에 \를 붙이면 줄바꿈 없이 이어서 쓸 수 있다.
			//HTML, JSON등을 쓸 때 유용하다.
			
			fos = new FileOutputStream("D:\\kimisak\\java\\java_work\\fileOut.txt");
			
//			fos.write('f');
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
			
			String str = """
					여러줄
					문자열
					리터럴
					자동으로 줄바꿈이 들어갑니다.
					""";
			
			fos.write(str.getBytes());
						
			
		} catch (Exception e) {

		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
