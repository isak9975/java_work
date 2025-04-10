package ex02_bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex02_BufferedReader {
	public static void main(String[] args) {
		//BufferedReader를 이용해서 키보드에서 값을 입력받는다.
		//장점 : Scanner 보다 속도가 빠르다.
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//키보드로부터 읽어옴
		try {
			System.out.print("문장을 입력해주세요 : ");
			String string = br.readLine();
			System.out.println();
			
			//정수 입력
			System.out.print("정수 입력 : ");
			int n = Integer.parseInt(br.readLine());
			System.out.println();
			
			System.out.println("문자열 : " + string);
			System.out.println("정수 : " + n);
					
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		//원칙대로면 close()를 통해 닫아줘야 하는데
		//System.in은 닫으면 별로 좋지 않다.
		
		//왜 static이니까 System.in을 받아서 사용하는 
		//다른 객체들이 못쓰게 된다.
	}
}
