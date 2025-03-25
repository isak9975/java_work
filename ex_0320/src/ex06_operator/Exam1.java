package ex06_operator;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 상자 하나에는 농구공이 5개 들어갈 수 있다.
		// x 개의 농구공을 담기 위한 박스의 개수를 구하세요
		// 농구공의 개수는 키보드를 통해 입력 받습니다.
		
//		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("농구공 개수를 입력해 주세요 : ");
//		int ball = scanner.nextInt();
//		int box = 5;
//		int result= ball%5!=0?(ball/5)+1:ball/5;
//		System.out.println("농구공을 담기 위해 필요한 박스의 개수는");
//		System.out.printf("%d 개 입니다.",result);
		
		
		
		//과수원이 있다
		//배, 사과, 오렌지를 키우고 있는데 하루에 생상되는 양은
		//각각 5,7,5개이다
		//과수원에서 하루에 생산되는 총 개수를 추력하고
		//시간당 전체 과일의 평균 생산 갯수를 출력하시오
		//평균값을 담는 변수는 float으로 할것
		int ap = 7;
		int or = 5;
		int pe = 5;
		int day = ap + or + pe;
		float avg = (float)day/24;
		System.out.println("하루 총 생산량 : " + day);
		System.out.printf("시간당 평균 생산 개수 : %.2f",avg);
		
		
	}//end main
}//end c
