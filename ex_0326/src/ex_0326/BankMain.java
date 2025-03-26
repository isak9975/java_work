package ex_0326;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		UserInfo userInfo = new UserInfo();
		
		int money = 0;
		
		//프로그램 시작
		out:while(true){
			System.out.println("======================");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액확인");
			System.out.println("4. 종료");
			System.out.println("======================");
			
			System.out.print("메뉴를 선택하세요 : ");
			int state = scan.nextInt();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
			if(state==1){
				System.out.print("입금할 금액을 입력해주세요 : ");
				money = scan.nextInt();
				if(userInfo.deposit(money)) {
					System.out.println(money + "원 입금이 완료되었습니다");
				}else {System.out.println("처음으로 돌아갑니다");}
			}
			else if(state==2) {
				System.out.print("출금할 금액을 입력해주세요 : ");
				money = scan.nextInt();
				if (userInfo.withDraw(money)) {
					System.out.println(money + "원 출금이 완료되었습니다");
				}else{System.out.println("처음으로 돌아갑니다");}
				}
			else if(state==3) {
				System.out.println("잔액은 : "+userInfo.showMoney()+"원 입니다");
				}
			else if(state==4) {
				System.out.println("[프로그램 종료]");
				scan.close();
				break out;}
			else {System.out.println("잘못입력하셨습니다");}
		}
		
	}//end main
}//end class
