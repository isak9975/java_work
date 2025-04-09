package ex02_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_CopyTest {
	public static void main(String[] args) {
		String path = "D:\\kimisak\\java\\java_work\\high.jpg";
		
		FileInputStream fis = null;
		
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream("D:\\kimisak\\java\\java_work\\high.jpg");
			
			fos = new FileOutputStream("D:\\kimisak\\java\\java_work\\highcopy.jpg");
			
			byte[] buffer = new byte[512];
			
			//현재 시간을 m/s단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			int read = 0;
			//read()를 통해 읽는다.
			while( (read=fis.read(buffer)) != -1) {
				//읽어온 내용을 write()로 쓴다.
				//읽자 마자 쓰는것보다
				//바이트 배열을 이용한 복사가 훨씬 빠르다
				fos.write(buffer,0,read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			double time = (double)(end - start)/1000;
						
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
		//직접 복사하는것보다 바이트배열을 이용하여 이미지를 복사했을때가
		//속도가 매우 빠르다
