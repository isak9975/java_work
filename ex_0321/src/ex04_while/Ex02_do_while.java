package ex04_while;

import java.util.Scanner;

public class Ex02_do_while {
	public static void main(String[] args) {
		//while 문과 같이 조건을 만족할 때까지 반복한다.
		//다만, while 문과 다른 점은 먼저 루프를 한 번 실행한 후 
		//조건식을 검사한다는 점이다.
		//즉, 조건식의 결과와 상관없이 무조건 한번은 실행한다
		
		//do{
		//	반복하고자 하는 명
		//}while(조건식)
		
		int i = 11;
		do {
			System.out.println(i);
		}while(i <= 10);
			
			
		//1~10까지의 총합 구하기
//		do {
//			
//			
//		}while(){};
		
		//비밀번호 확인 프로그램 만들기
		//사용자로부터 비밀번호를 입력받아 올바른 비밀번호가
		//입력될때까지 계속 입력을 요구하는 프로그램 만들기
		//비밀번호는 9486
		
		//비밀번호를 입력하세요
		//비밀번호가 틀렸습니다
			
		Scanner scan = new Scanner(System.in);
		boolean isCorrect = true;
		int PWD = 9486;
		
	
		while(isCorrect) {
			System.out.printf("비밀번호를 입력하세요 : ");
			int pwd = scan.nextInt();
			System.out.println();
			
			if(pwd==PWD) {
				System.out.println("접속성공!");
				isCorrect = false;				
			}else {
				System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요");
			}
		}
			
			
		
			
			
	}
}
