package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

//학생의 이름과 점수를 입력받아 scores.txt저장
//이어쓰기를 한다.
//마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현하기
//입력:
//이름: 홍길동
//점수: 90
//이름: 김영희
//점수: 85
//이름: exit
//
//출력:
//현재 저장된 점수 목록:
//홍길동 : 90
public class Exan02 {
	public static void main(String[] args) {
		String path = "D:\\kimisak\\java\\java_work\\scores.txt";
		
		File f = new File(path);

		FileOutputStream fos = null;
		
		FileInputStream fis = null;
		
		Scanner scan = new Scanner(System.in);
		
		boolean check = true;
				
		try {
			
			fos= new FileOutputStream(f,true);

			while(check) {
				System.out.println("[ 입 력 ]");
				System.out.print("이름 : ");
				String name = scan.next();
					if(name.equalsIgnoreCase("exit")) {
						check=false;
						continue;
					}
				System.out.print("점수 : ");
				String score = scan.next();
				String result = name+" : " +score+"\n";
				String result1 = "";
				
				for(int i =0;i<result.length();i++) {
					result1 += result.charAt(i)+3;
				}
				
				fos.write(result1.getBytes());				
				System.out.println("[저장 완료]");
				System.out.println();
			}

			
			System.out.println();
			System.out.println("[ 출 력 ]");
			System.out.println("현재 저장된 점수 목록");
			
			fis = new FileInputStream(f);
			
			byte[] list = new byte[(int)f.length()];
			
			String listopen = new String(list,"UTP-8");
			String list1 = "";
			
			fis.read(list);
			
			for(int i=0;i<list.length;i++) {
				list1 += (char)(listopen.charAt(i)-3);
			}
			
			System.out.println(list1);
						
			
		} catch (Exception e) {
		}finally {
			try {
				fis.close();
				scan.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
