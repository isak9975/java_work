package ex02_File;

import java.io.File;

public class Ex04_File {
	public static void main(String[] args) {
		String path = "D:\\kimisak\\java\\java_work\\test.txt";
		
		File f = new File(path);
		
		if(f.exists()) {
			System.out.println("파일이름 : "+f.getName());
			System.out.println("절대경로 : "+f.getAbsolutePath());
		}
		
	}
}
