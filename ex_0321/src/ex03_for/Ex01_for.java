package ex03_for;

import java.util.Scanner;

public class Ex01_for {
	public static void main(String[] args) {
		//반복문
		//특정 명령을 원하는 만큼 반복하여 실행하는 제어문
		//for, while
		
		//for
		//주로 반복 횟수가 정해져있을 때 싸용하는 문법
		
		//for(초기식; 조건식; 증감식){
		//	반복하고자 하는 명령
		//}
		
		//초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
		//조건식 : 반복을 위한 종료값으로 비교연산자를 많이 사용한다
		//증감식 : 초기식에 있는 변수의 증감시켜주는 역할을 한다.
		
		for(int i=0; i<=3; i++) {
			System.out.println(i);
		}

		//초기값 밖에다 쓸수 있음, 대신 자리는 마련해야함
		int i=0;
		for(;i<=3;) {
			//증감값도 밖에다 쓸 수 있음, 대신 자리는 마련해야함
			System.out.println(i);
			i++;
		}
		
		//초기식에 들어가는 변수 i 를 무조건 사용할 필요는 없다.
		//사용하는게 좋을 것 같을때 쓰면된다.
		
		
		//1부터 10까지 출력하는 for 문 작성하기
		//1 2 3 4 5 6 7 8 9 10
		for(int j=1;j<11;j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		
		
		//10부터 1까지 출력하는 for문 작성하기
		for(int j=10;j>0;j--) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		//1부터 10까지 3의 배수만 출력하는 for문 작성하기
		for(int j=1;j<11;j++) {
			if(j%3==0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();

		
		//1부터 10까지 총 합 구하기
		int result=0;
		for(int j=0;j<11;j++) {
			result += j;
		}
		System.out.println(result);
		
		
		//키보드에서 정수를 하나 입력받아
		//해당 단의 구구단 출력하기
		//2x1 = 2
		//2x2 = 4
		Scanner scanner = new Scanner(System.in);
//		System.out.print("단을 입력해주세요 : ");
//		int dan = scanner.nextInt();
//		
//		for(int j= 1; j<11; j++) {
//			System.out.printf("%d X %d = %d\n",dan,j,dan*j);
//		}
		
		
		//키보드에서 정수 n 을 입력받고
		//1부터 정수 n 까지의 총합을 계산하여 결과 출력하기
		System.out.println("N을 입력해주세요");
		int n = scanner.nextInt();
		int result1 = 0;
		for(int j=1;j<=n;j++) {
			result1 += j;
		}
		System.out.println(result1);
		
		
		//10개의 정수를 입력받아
		//그 중 짝수의 개수가 몇개인지 구하세요
		int count = 0;
		for(int j =0;j<10;j++) {
			System.out.println(j + "번째 수를 입력해주세요 : ");
			int a = scanner.nextInt();
			if(a%2==0){
				count++;
			}
		}
		System.out.println("짝수의 갯수 : " + count);
		
		
		
		//1 + (1+2) + (1+2+3) + 
		//(1+2+3+4)
		//의 결과를 계산하시오
		int result3 = 0;
		for(int j=1;j<=10;j++) {
			result3 = result3 + j;
		}
		System.out.println(result3);
		
		
		
		//양의 정수 x를 키보드에서 입력받아
		//x가 홀수면 x이하의 홀수인 정수의 ㅎ바을 구하고
		//x가 짝수면 x이하의 짝수인 정수의 제곱의 합을 구하세요
		//x가 7이라면 1+3+5+7 = 16
		//x가 10이면 2x2 + 4x4 + 6x6 + 8x8 + 10x10
		
	
		int xx = scanner.nextInt();
		int result11 = 0;
		if(xx%2==1) {
			for(int j =0;j<=xx;j++ ) {
				if(xx%2==1) {
					result11 += j;	
				}
			}
		}else {
			for(int j =0;j<=xx;j++ ) {
				if(xx%2==0) {
					System.out.printf("%d x %d=",j,j,(j*j));
				}
			}
		}
		System.out.println("[홀수]"+result11);		
	}
}
