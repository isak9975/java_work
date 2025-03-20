package ex05_Scanner;

import java.util.Scanner;

public class Ex05_Scanner {
	public static void main(String[] args) {
		//데이터의 입력
		//프로그램을 실행할 때 키보드를 통해 입력한 데이터를
		//변수에 대입하겠다.
		
		//java.util 패키지에 있는 Scanner
		//다른 패키지에 있는 기능을 사용하기 위해서는 import 를 해야한다.
		//import 경로
		//let obj = new Object();
		//obj.key = value; //프로퍼티가 없으면 추가		
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("숫자를 입력해주세요");
//		int num1 = scan.nextInt();//정수 입력받기
//		System.out.println("입력한 숫자 : " + num1);
		
		
		//나이입력 받기
		//제 나이는 x 세 입니다.
		System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		System.out.print("주소를 입력해주세요 : ");
		scan.nextLine(); //엔터값을 먹어줄 친구 => 앞의 next()의 엔터값을 먹고 다음게 사라지기 때문
		String address = scan.nextLine();
		System.out.println("=================================================");
		System.out.printf("제 이름은 %s, 나이는 %d세 입니다,\n%s에 살고 있습니다.",name,age,address);
		System.out.println();
		System.out.println("=================================================");
		
		
		
	}//end main
}//end c
