package ex01_bufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_ReadImage {
	public static void main(String[] args) {
		//byte배열을 사용해서 이미지를 읽어왔을 때
		//속도가 굉장히 빠르다는 것을 알 수 있었다.
		
		FileInputStream readFile = null;
		
		BufferedInputStream readBuffered = null;
		
		try {
			System.out.println("보조스트림으로 읽기");
			readFile = new FileInputStream("D:\\kimisak\\java\\java_work\\high.jpg");
			
			//버퍼라는 공간을 만들어주고 read()를 통해서 읽어온 데이터를
			//버퍼라는 공간에 저장을 해주고, 버퍼가 다 차게되면 내보낸다.
			readBuffered = new BufferedInputStream(readFile);
			
			//시작 시작 측정
			long start =  System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			//이미지를 읽는 속도를 측정하려는 것이기 때문에 읽기만
			while(readBuffered.read() != -1) {
				
			}
			
			long end = System.currentTimeMillis();
			double time = (double)(end-start)/1000;
			System.out.println("끝나는 시간 : " + time + "초");
			System.out.println("보조스트림으로 읽기 종료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(readBuffered!=null) {
					readBuffered.close();
				}
				if(readFile!=null) {
					readFile.close();
				}
			} catch (Exception e2) {

			}
		}
		
	}
}
