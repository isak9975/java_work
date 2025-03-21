package ex06_operator;

import java.util.Scanner;

public class Ex03_Operator {
	public static void main(String[] args) {
	
		int a = 10; //1010
		int b = 2;	//0010
		int c = a&b; //0010
		System.out.println(c); //2 => and 연산이기때문
		
		
		int a2 =12; //1100
		int b2 = 8; //1000
		int c2 = a2 | b2; //1100
		System.out.println(c2); //12 => or 연산이기때문
		
		
		int a3 = 9; //1001
		int b3 = 11; //1011
		int c3 = a3 ^ b3; //0010
		System.out.println(c3);//2
		
		int x = 7;//0111
		System.out.println(~x);//1000
		//~x -> -(x+1)
		
		
		x = 10;//1010
		int result = x<<1;//20
		System.out.println(result);
		int result1 = x>>1;//5
		System.out.println(result1);
		
		
		//삼항연산자
		//조건식? 참일  때 실행할 명령 : 거짓일때 실행할 명령;
		int i = 10;
		int i2 = 15;
		result = ++a >= b ? 1:0;
		System.out.println(result);
		
		
		int xx =5 ;
		int yy = xx++;
		System.out.println(xx+""+yy);
		
		
		int xxx = 10;
		int yyy = 20;
		int zzz = (++xxx + yyy--);
		System.out.println(zzz);
		
		
		int aa = 10;
		int bb = 12;
		boolean result11= ++aa >= bb || 2+7 <= bb && 13 -bb >= 0 && (aa+=bb)-(aa%bb) >10;
		System.out.println(result11);
		
		Scanner scan = new Scanner(System.in);
		

		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		System.out.print("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 : ");
		int en = scan.nextInt();
		System.out.println("총점 : " + (math+kor+en));
		System.out.println("평균 : " + (math+kor+en)/3);
		System.out.println((math+kor+en)/3 >= 40 && kor >=40 &&math >=40 &&en >=40 && (math+kor+en)/3>=60? "합격":"불합격");
	}
	
	
}
