package ex04_while;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

import javax.naming.LinkRef;

public class Exam1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		//비밀번호 대조
		int pw = 9486;
		int answer = 0;
		do {
			System.out.println("비밀번호 입력 : ");
			answer = scan.nextInt();
			
			if(pw==answer) {
				System.out.println("비밀번호가 맞습니다.");
				
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}while(pw!=answer); //비밀번호가 맞지 않으면 다시 반복
		
		
		//
		int kor = 0;
		int en = 0;
		int math = 0;
		do {
			System.out.println("국어 점수 : ");
			kor = scan.nextInt();
			System.out.println("수학 점수 : ");
			math = scan.nextInt();
			System.out.println("영어 점수 : ");
			en = scan.nextInt();
		} while (kor < 40 || en <40 || math <40);
		
		
		
		
	
	}//end main
}//end class
