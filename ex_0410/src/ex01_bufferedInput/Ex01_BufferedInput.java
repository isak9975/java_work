package ex01_bufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex01_BufferedInput {
	public static void main(String[] args) {
		//메인스트림의 선언
		FileInputStream fis = null;

		//보조스트림의 선언
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("D:\\kimisak\\java\\java_work\\test.txt");
			
			//보조스트림은 생성자에 반드시 기반스트림 객체를 필요로 한다.
			bis = new BufferedInputStream(fis);
			
			//보조스트림이 단독으로 읽거나 쓰는것은 불가능하다.
			
			//기반스트림 객체로부터 위임을 받아서 읽거나 쓰는것은 가능하다.
			
			int read = 0;
			
			byte[] buffer = new byte[100];
			
			//사용법은 원래 스트림과 같다.
			bis.read(buffer);
			
			//바이트배열이니까 배열로 받아서 바꿔서 출력해준다.			
			String bufferopen = new String(buffer);
			
			System.out.println(bufferopen);
							
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//역순으로 닫아준다.
			//보조스트림 먼저 닫고 기반스트림을 닫아야 한다.
			try {
				if(bis != null) {
					bis.close();
				}
				
				if(fis != null) {
					fis.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
