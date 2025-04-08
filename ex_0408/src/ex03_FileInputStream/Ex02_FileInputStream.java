package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

//한글 파일을 읽어오는 방법이 따로 있다.
public class Ex02_FileInputStream {
	public static void main(String[] args) {
		
		//경로를 저장
		String path = "D:\\kimisak\\java\\java_work\\test.txt";
		
		//File 객체에 경로 알려주기
		File f = new File(path);
		FileInputStream fis = null;
		
		//length()를 통해 내용크기만큼만 만든다
		byte[] read = new byte[(int)f.length()];
		
		try {
			if(f.exists()) {
				fis = new FileInputStream(f);
				//파일에서 읽어온 내용을 바이트배열에 담는다.
				//read() : 1바이트씩 읽어온다.
				//read(byte[] b) : 한번에 읽어와서 배여렝 담는다.
				fis.read(read);
				
				//문자열 객체의 생성자에 바이트배열을 전달함으로써
				//문자열로 변환이 가능하다
				String res = new String(read,"UTF-8");
				System.out.println(res);
			
			}			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
