package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
		FileReader fr = null;
		FileWriter fw = null;
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		
		try {
			fw = new FileWriter("D:\\kimisak\\java\\java_work\\exam01.txt",true);
			
			while(check) {
				System.out.println("메모장 입력 (exit 입력시 종료) :");
				System.out.print("   >");
				String text = scan.next();
					if(text.equalsIgnoreCase("exit")) {
						check = false;
						continue;
					}
					
				fw.write(text);	
				System.out.println("[저장완료]");
				System.out.println();
			}
			
			System.out.println("메모장 출력");
			fr = new FileReader("D:\\kimisak\\java\\java_work\\exam01.txt");
			
			int code = 0;
			
			while((code=fr.read())!= -1 ) {
				System.out.print((char)code);
			}	
			
		} catch (Exception e) {

		} finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
