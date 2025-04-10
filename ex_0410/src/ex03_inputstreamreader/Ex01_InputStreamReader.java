package ex03_inputstreamreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex01_InputStreamReader {
	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("D:\\kimisak\\java\\java_work\\test.txt");
			is = new InputStreamReader(in);
			
			int read = 0;
			
			while((read=is.read())!=-1) {
				System.out.println((char)read);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(is!=null)is.close();
				if(in!=null)in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
