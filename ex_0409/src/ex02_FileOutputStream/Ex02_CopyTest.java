package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System.Logger;

import javax.xml.transform.Source;

public class Ex02_CopyTest {
	public static void main(String[] args) {
		//read()와 write()를 이용하여 복사
		String path = "D:\\kimisak\\java\\java_work\\high.jpg";
		
		FileInputStream fis = null;
		
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream("D:\\kimisak\\java\\java_work\\high.jpg");
			
			fos = new FileOutputStream("D:\\kimisak\\java\\java_work\\highcopy.jpg");
			
			//현재 시간을 m/s단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			int read = 0;
			//read()를 통해 읽는다.
			while( (read=fis.read()) != -1) {
				//읽어온 내용을 write()로 쓴다.
				fos.write(read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			long time = (end - start)/1000;
						
			System.out.println("시작시간 : " + start);
			System.out.println("종료시간 : " + end);
			System.out.println("총 소요시간 : "+ time + "s");
			
		} catch (Exception e) {
			
		}finally {			
			try {
				//역순으로 닫아야 한다.
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}	
		
		
	}
}
