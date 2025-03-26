package ex03_class;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;

public class MethodTest {
	
	//배열의 최대값을 찾는 maxFinder메서드
	//임의의 배열은 매개변수로 받자.
	
	public int maxFinder(int[] arr) {
		int max =0;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}//end method
	
	
	//원의 넓이와 둘레 구하기
	//함수를 호출하면서 반지름을 받는다.
	//원의 넓이를 구하는 circleArea
	//원의 둘레를 구하는 circleRound
	//circleArea는 결과 출력하기
	//circleRound는 결과 반환하기
	//원의 넓이 :3.14*r*r;
	//원의 둘레 : 2*3/14*r;
	
	
	public void circleArea(int r) {
		System.out.println("원의 넓이 : "+(r*r*3.14));
	}
	
	public float circleRound(int r) {
		return (float)(2*3.14*r);
	}
	
	
	
	//계산기 만들기
	//사칙연산을 할 수 있는 calculator 메서드 만들기
	//두 수와 연산자를 매개변수로 받는다.
	public int calculator(int a,int b,String c) {
		switch(c) {
		case "+": return a+b;
		case "-": return a-b;
		case "/": return a/b;
		case "*": return a*b;
		}
		return 0;
	}
	
	
	//1~50사이의 난수를 생성
	//main 쪽에서 키보드를 통해 정수를 입력 받는다.
	//check()메서드를 만들어서 사용자가 입력한 숫자를 판단.
	//발생한 난수보다 크다면 Down! 작다면 up!을 출력
	//사용자가 입력한 숫자와 발생한 난수가 같을 경우에 
	//프로그램을 종료(몇회만에 맞췄는지 판단해보자)
	

	
	public boolean check() {
		
		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		
		int random = r.nextInt(50)+1;
		int count = 0;
		
		while(true) {
			System.out.print("숫자를 입력해주세요 : ");
			int m = scan.nextInt();
					
			if(m==random) {
				System.out.println("Correct!");
				System.out.println(count+"회 만에 맞췄습니다");
				System.out.println("프로그램 종료");
				return true;
			}
			else if(m < random) {
				System.out.println("UP!");
				count++;
			}
			else if(m>random) {
				System.out.println("DOWN!");
				count++;
			}
			
			
		}//end while
		
		
		
		
//      Graph라는 이름의 메인 클래스를 만들어 
      //0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
      //해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.
//
//      단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.
//
//      결과:
//      0507...... //난수 100개
//      0의 갯수 : ############ 12
//      1의 갯수 : ######### 9
//      2의 갯수 : ########### 11
//      3의 갯수 : ######## 8
//      4의 갯수 : ############## 14
//      5의 갯수 : ####### 7
//      6의 갯수 : ######### 9
//      7의 갯수 : ############# 13
//      8의 갯수 : ####### 7
//      9의 갯수 : ########## 10
		
		
		
//UserInfo 클래스를 만든뒤, 금액을 저장할 money 라는 변수를 만든다
//deposit(int money)메서드를 만들어 유저가 돈을 입금했을 경우를 처리
//withdraw(int money)베서드를 만들어 유저가 돈을 출금했을 경우를 처리
//단 이 메서드에는 출금하고자 한느 돈 보다 잔액이 적을 경우 잔액이 부족하다는 메세지가 출력되도록 한다.
//shwMoney() 메서드를 만들어 현재 잔액을 반환하도록 한다.\
		
		
//BankMain 클래스를 만들고
//각각의 메뉴를 다음과 같이 만들고
//1. 입금
//2. 출금
//3. 잔액확인
//4. 종료
		
//메뉴를 선택할 시 기능을 호출한다
//종료를 선택하면 프로그램이 종료된다.
		
		
		
		
		
	}	
	
	
}
