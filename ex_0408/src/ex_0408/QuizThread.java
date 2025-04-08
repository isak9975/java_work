package ex_0408;
/*
 
 QuizThread 클래스를 만들어 스레드를 상속받는다

startGame() 메서드를 만들고 그 안에서 1~100 사이의 난수 두개를 더하는 문제를 출제

키보드에서 값을 입력하여 5문제가 정답처리 될 때까지 로직을 반복합니다.

모든문제를 맞추는데 몇 초가 걸렸는지를 화면에 출력하며 프로그램을 종료하기

QuizMain클래스에서는

QuizThread qt = new QuizThread();

qt.start();

qt.startGame();
  
  
 */


import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	private int count=0;
	private int time=0;
	
	
	public void startGame() {
		while(!(count==5)) {
			Scanner scan = new Scanner(System.in);
			
			int num1 = new Random().nextInt(100)+1;
			int num2 = new Random().nextInt(100)+1;
			int sum =num1 + num2; 
			
			System.out.print(num1 +" + "+ num2+" = ");
			int result = scan.nextInt();
			
			if(result == sum) {
				System.out.println("정답입니다");
				count++;
				if(count==5) {
					System.out.println("[게 임 종 료]");
					System.out.println("["+time+"초 걸렸습니다]");
				}
			}
			else {
				System.out.println("오답입니다.");
			}
		}
	}//end method
	
	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(1000);
			time++;
		} catch (Exception e) {

		}
	}
		
	}
	
}
