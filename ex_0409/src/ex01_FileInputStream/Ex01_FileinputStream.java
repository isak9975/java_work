package ex01_FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex01_FileinputStream {
	public static void main(String[] args) {
		
		//표준입력스트림
		//자바에서 프로그램이 외부로부터 데이터를 입력받을 수 있게
		//해주는 기본 통로
		//기본대상 : 키보드
		
		//사용자가 키보르도 입력한 값을 keyboard 배열에 저장
		//사용자가 엔터를 입력할 대 까지 입력을 받고,
		//엔터키 값까지 포함되어 저장
	
		byte[] keyboard = new byte[100];
		
		Scanner sacn = new Scanner(System.in);
		
		try {
			System.out.println("값 : ");
			System.in.read(keyboard);
			//키보드에 값을 입력받기 윟나 표준입력 장치 스트림
			
			String s = new String(keyboard).trim();
			System.out.println(s);
			
			//Scanner sc = new Scanner(System.in);
			
			//Scanner(System.in)          vs System.in.read()
			//문자단위로 입력		             바이트 단위 입력
			//다양한 타입(String,int,double)    int(0~255) 또는 byte[]
			//nextLine으로 여러줄 처리가능         직접처리해야한다.
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
			//scan.close();
			//in이 static이고 메모리에 한번만 올라가기 때문에
			//닫아버리면 프로그램 전체에서 더 잇아 키보드 입력이 불간으해진다.
		
		
				
	}
}
