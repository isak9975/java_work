package ex02_try_catch;

import java.beans.ExceptionListener;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		//정수가 아닌걸 입력했을때
		//해당값은 정수가 아닙니다라고 출력하기
		//정수 : 100
		//결과 : 100
		
		//정수 : aab
		//결과 : aab은(는) 정수가 아닙니다
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		String str=null;
		try {
			System.out.print("정수를 입력하세요 : ");

			str = scan.next();
			
			num = Integer.parseInt(str);
			
			System.out.println("결과 :" + str);
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println( str +"은(는) 정수가 아닙니다");
		}
		System.out.println("프로그램 종료");
	}
}
