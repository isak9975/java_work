package ex02_try_catch;

import java.util.Scanner;

public class EX06_throw {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = 0;
		
		while(true) {
			try {
				System.out.print("숫자를 입력하세요(0~50) : ");
				val = scan.nextInt();
				if(val==-1) {
					break;
				}	
				if(val<-1||val>50) {
					//throw new 예외객체();
					throw new Exception("숫자의 허용범위가 아닙니다.");
					//강제로 예외 발생
				}
			} catch (Exception e) {
				System.out.println("에러메세지 : "+ e.getMessage());
			}
		}//end while
		System.out.println("프로그램 종료");
	}
}
