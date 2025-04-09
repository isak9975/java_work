package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.stream.Collector.Characteristics;

public class Exam01 {
	public static void main(String[] args) {
		
		String path = "D:\\kimisak\\java\\java_work\\test.txt";
		
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		try {
			if(f.exists()) {
				
			
			fis = new FileInputStream(f);
			fis.read(read);
			String sentence = new String(read);
			
			
			for(int i = 0;i <sentence.length()/2;i++) {
				
				if(!(sentence.charAt(i)==sentence.charAt(sentence.length()-i-1))) {
					System.out.println(sentence+"는 회문이 아닙니다.");
					return;
				}
			}//end for

			System.out.println(sentence+"는 회문입니다");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
