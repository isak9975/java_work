package ex02_try_catch;

import java.util.Scanner;

public class Ex02_try_catch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("점수를 입력해주세요 : ");
			int score = scan.nextInt();
			if(score>= 65) {
				System.out.println("합격입니다");
			}else {
				System.out.println("불합격입니다");
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();//발생한 예외가 무엇인지 출력해주는 메서드
			System.out.println("키보드 입력이 잘못 되엇습니다");
		}
		System.out.println("프로그램 종료");
	}
}
//Exception e -> 하위 예외들에 대한 모든 처리를 할 수 있다.
	//특정 클래스로 지정해 농흐면 -> 해당 예외밖에 처리할 수 없다.
//Exception - RuntimeException - InputMismatchException
