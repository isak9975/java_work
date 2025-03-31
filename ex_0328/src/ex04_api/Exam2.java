package ex04_api;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다.
		//입력받은 문자열에서 소문자 a가 몇 개 있는지 판별하시오.
		//예시
		//입력 : asdfasdf
		//결과 : 2
		
		String str = "asdfasdf";
		int count =0;
		
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='a')
			
				count++;		
					
		}
		System.out.println("문자열은 "+count+" 개 들어있습니다");
		
		
		//생일과 성별구하기
		//예시
		//주민번호를 모두 입력하세요(-포함)
		//911223-103345
		//당신은 1991년 12월 23에 태어난 남자입니다.
		
		
		String str2="911223-103345";
		
		String front = str2.split("-")[0];
		int back = Integer.parseInt(str2.split("-")[1].substring(0,1));
				
		String year = front.substring(0,2);
		String month = front.substring(2,4);
		String day = front.substring(4,6);
		
		System.out.println(
			"당신은 19"+month+ "년" 
			+year+"월"
			+day+"일"
			+(back%2!=0?"남자입니다":"여자입니다"));
		
		
		
		//회문 판별하기
		//앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		//키보드에서 문자열을 읿력받아 회문이면 XXX는 회문입니다.
		//아니면 XXX는 회문이 아닙니다.
		//토마토는 회문입니다.
		//지하철은 회문이 아닙니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력 하세요 : ");
		String str3 = scan.next();
	
		
//		String str3 = "건조한조건";
			if(str3.trim().length()<0) {
				System.out.println("잘못 입력하셨습니다");
			}
		
			for(int i =0;i<str3.length()/2;i++) {
				if(str3.charAt(i)!=str3.charAt(str3.length()-1-i)) {
					System.out.println(str3+"는 회문이 아닙니다.");
					return;
				}
			}
			System.out.println(str3+"는 회문이 맞습니다");
			
//		System.out.println(str3.charAt(0));	
//		System.out.println(str3.charAt(str3.length()-1));
//		
//		str3.charAt(0);
//		str3.charAt(str3.length()-1);
		
	}//end main
}
