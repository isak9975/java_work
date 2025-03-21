package ex03_for;

import java.util.Scanner;

public class EX03_do_while {
	public static void main(String[] args) {
		//학생의 국어, 영어, 수학 점수를 입력받는다.
		//단, 각 과목은 40점 이상이어야 한다.
		//40점 미만이면 해당 과목 점수를 다시 입력 받아야한다.
		
		Scanner scanner = new Scanner(System.in);
		
		int kor=0;
		int math =0;
		int en =0;
		boolean state = true;
		
		do {
		System.out.println("국어 점수를 입력해주세요");
		 kor = scanner.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		 math = scanner.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		 en = scanner.nextInt();
			if(kor>=40 && math>= 40 && en>=40) {
				
			}
			else {
				System.out.println("다시입력해주세요");
				state=false;
			}
		}while(true);
		

			

		
	}
}
