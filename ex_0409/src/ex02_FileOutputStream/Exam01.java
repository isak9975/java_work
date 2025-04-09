package ex02_FileOutputStream;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Scanner;

//학생의 이름과 점수를 저장하는 프로그램
//이름과 점수를 FileOutputStream을 이용하여 scores.txt파일에 저장하세요

//요구사항
//1. 사용자로부터 이름과 점수를 입력받는다
//2. 입력받은 데이터를 "이름 : 점수 \n: 형식으로 문자열로 만들어 파일에 쓴다.
//ex_"김철수 : 84:"
//3. 이름에 exit를 입력하면 프로그램 종료
//4. 파일은 scores.txt로 저장되며, 기존 내용은 덮어 씁니다.

//“이름 : 점수” 형식의 문자열의 각 문자의 char값을 +3을 해 암호화 한다.
//Jon : 85\n
//Mrkq#5;#B8
public class Exam01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		FileOutputStream fos = null;
		
		String result="";
		
		boolean check = true;
		
		
		try {
			fos = new FileOutputStream("D:\\kimisak\\java\\java_work\\scores.txt");
			
			
			while(check) {
				System.out.println("[종료시 exit 입력]");
				System.out.print("학생 이름을 입력하세요 : ");
				String name = scan.next().trim();
				
					if(name.equalsIgnoreCase("exit")) {
						check=false;
						continue;
					}
				
				System.out.print("학생 점수를 입력하세요 : ");
				int score = scan.nextInt();
						
				result += name+" : "+score+"\n";
				
				System.out.println();
			}//end while
			
			
			//암호화
			byte[] result1 = result.getBytes();
			for(int i=0;i<result.length();i++) {
				result1[i] += 3;
				
				System.out.println(result1[i]+3);
				
			}
			
			//최종저장			
			fos.write(result1);
						
			System.out.println("저장이 완료 되었습니다");
			System.out.println();		
			
			
		} catch (Exception e) {

		}finally {
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
