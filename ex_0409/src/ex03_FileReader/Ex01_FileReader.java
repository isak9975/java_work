package ex03_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Ex01_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;

		String string = "";
		int[] ina = new int [5];
		
		
		try {
			fr = new FileReader("D:\\kimisak\\java\\java_work\\test.txt");
			
			int code = 0;
			
			while((code = fr.read())!=-1) {
				System.out.print((char)code);
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fr!=null) {
				
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}				
			}
		}
		
	}
}
