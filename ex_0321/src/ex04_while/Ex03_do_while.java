package ex04_while;

import java.util.Scanner;

public class Ex03_do_while {
	public static void main(String[] args) {
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
