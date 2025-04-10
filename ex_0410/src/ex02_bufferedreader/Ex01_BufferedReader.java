package ex02_bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex01_BufferedReader {
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader breader = null;
		
		try {
			reader = new FileReader("D:\\kimisak\\java\\java_work\\book.txt");
			
			breader = new BufferedReader(reader);
			
			String str ="";
			
//			System.out.println(breader.readLine()); => 한줄 가져옴
			
			//버퍼에 문자를 저장하기 때문에 한번에 불러오는게 가능하다.(문장)
			while((str=breader.readLine()) != null) {
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(breader!=null) {
					breader.close();
				}
				if(reader!=null) {
					reader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
