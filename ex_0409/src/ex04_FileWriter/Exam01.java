package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;import javax.swing.plaf.basic.BasicPasswordFieldUI;

//메모장 프로그램 만들기
//사용자가 키보드로 입력한 내용을 "memo.txt" 에 저장하고
//입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면에 출력하기
//사용자로부터 여러 줄의 텍스트를 입력받는다.
//사용자가 exit 입력하면 종료합니다.

//메모장 입력 (exit 입력시 종료) :
//	>오늘 날씨가 좋다.
//	>내일은 시험이다.

//입력한 내용에서 단어의 빈도수
//오늘 : 1
//날씨가 : 1
//좋다 : 1
public class Exam01 {
	public static void main(String[] args) {
		String path ="D:\\kimisak\\java\\java_work\\exam01.txt";
		FileReader fr = null;
		FileWriter fw = null;
		Scanner scan = new Scanner(System.in);
		List<String> lineStrings = new ArrayList<String>();

		try {
			//1. 사용자의 입력 받아서 파일에 쓰기.
			
			fw = new FileWriter(path);
			
			while(true) {
				System.out.println("메모장 입력 (exit 입력시 종료) :");
				System.out.print("   >");
				String text = scan.nextLine();
					if(text.equalsIgnoreCase("exit")) {
						break;
					}else {
						//메모장에 쓰기전에 ArrayList에 추가
						lineStrings.add(text);
						text += "\n";
						fw.write(text);	
						System.out.println("[저장완료]");
						System.out.println();
					}
			}	
			
		} catch (Exception e) {

		} finally {
			try {
				fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//3. 단어별 빈도수 계산
		//Hello world
		//hello Java
		//I love Java
		
		//Hello : 2
		//world : 1
		//java : 2
		//I : 1
		//love : 1
		
		HashMap<String,Integer> wordCount = new HashMap<String, Integer>();
			
		for(String line : lineStrings) {
			String[] words = line.toLowerCase().split(" ");
			for(String word : words) {
				if(word.isEmpty())continue;
				wordCount.put(word,wordCount.getOrDefault(word, 0)+1);
				//getOrDefault(ket,default) => key를 가지고 값을 가져오는데 없으면 default값을 써라 	
			}
		}
		
		//result.txt에 저장
		try {
			fw=new FileWriter("D:\\kimisak\\java\\java_work\\result.txt");
			
			for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
				fw.write(entry.getKey()+" : "+entry.getValue()+"회\n");
			}
			System.out.println("단어 빈도수 저장완료");
			
		}catch (Exception e) {
 
		}
		
		
		
		try {
			//2. 파일에서 내용 읽어오기.
			System.out.println();			
			System.out.println("[메모장 출력]");
			
			int code = 0;
			
			fr = new FileReader(path);
			
			while((code = fr.read()) != -1 ) {				
				System.out.print((char)code);
			}
			
		} catch (Exception e) {
		
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
			
			}
		}
	}

}
