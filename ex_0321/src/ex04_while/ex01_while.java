package ex04_while;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class ex01_while {
	public static void main(String[] args) {
		//while 문은 반복 횟수가 정해져있을 때 할 수 도 있지만
		//반복 횟수를 정확히 모를때 유용하다.
		
		//초기식;
		
		//while(조건식){
		//	반복하고자 하는 명령
		//
		//	증감식;
		//}
		
//		int i =1;
//		
//		while(i<4) {
//			
//			System.out.println(i);
//			i++;
//		}
//		
//		//반복횟수가 정해져있지 않을 때
//		Random rndRandom = new Random();
//		int random = rndRandom.nextInt(10)+1; //1~10 사이의 난수
		Scanner scan = new Scanner(System.in);
//		//키보드에서 값을 입력받는다.
//		System.out.print("값을 입력해주세요 : ");
//		boolean isAnswer = true;
//		while(isAnswer) {
//			System.out.println("정답 : ");
//			int answer = scan.nextInt();
//			if(answer == random) {
//				System.out.println("정답입니다");
//				isAnswer = false;
//			}
//		}
		
		
		//int 타입 변수 num 에 정수를 입력ㅂ다고
		//각 자리수의 합을 더한 결과를 출력하세요
		System.out.printf("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		boolean done = true;
		int total=0;
		int result = 0;
		int num2=1;
		
		while(num>0) {
			System.out.println("계산중"+result+"멈춰"+num2+total);
			result = num %10;
			num = num/10;
		}
		System.out.println("모두 더한 값 : " + result);
		
		
		
		
		
	}//end main
}//emd class
