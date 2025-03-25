package ex02_break;

import java.util.Random;

public class Exam1 {
	public static void main(String[] args) {
		//1~50 사이의 난수를 생성하고 
		//난수를 맞추는 프로그램 만들기
		//적은 값이 난수보다 작으면
		//"맞춰야할 숫자가 더 큽니다."
		//적은 값이 난수보다 크면
		//"맞춰야할 숫자가 더 작습니다."
		
		//정답을 x 번만에 맞췄습니다.
		
//		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		int random = r.nextInt(50)+1;
		int num = 0;
		int rotation = 0;
		System.out.println("숫자는 : "+ random);
		
		
		out:while(true) {
		System.out.println("누적 시도 횟수 : "+ rotation);
		System.out.printf("숫자를 입력해 주세요 : ");
//		num = scan.nextInt();
		rotation++; //횟수 증가
		
		if(num == random){
			System.out.println("=====================");
			System.out.println("정답입니다!!");
			System.out.printf("%d번 만에 정답을 맞추셨습니다",rotation);
			System.out.println();
			System.out.println("=====================");
			break;
		}//end i
			//숫자 검사
		else if(num > random) {
				System.out.println("맞춰야할 숫자가 더 작습니다");
				System.out.println("숫자를 다시 입력해주세요");
			}
		else if(num < random) {
				System.out.println("맞춰야할 숫자가 더 큽니다");
				System.out.println("숫자를 다시 입력해주세요");
			}
			
		}//end while
		
		
		//for(;;) => for 문에 대한 무한루프
		
		//경우의 수
		//1. 난수를 맞추는 경우 -> if
		//2. 난수보다 큰 경우 -> if
		//3. 난수보다 작은 경우 -> if
		
		//반복횟수를 구하기 어려우니까
		//while 문을 써보는게 어떨까?
				
			
		
	}//end main
}//end class
