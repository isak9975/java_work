package ex01_multi.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		//배열 arr의 총합과 평균을 구하시오
		//총합 :
		//평균 : 
		int total = 0;
		int avg = 0;
		int temp = arr.length * arr[0].length;
		
		for(int i =0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				total += arr[i][j];
			}
		}
		
		System.out.println("총합 : " + total);
		System.out.println("평균 :" + total/temp);
		
System.out.println("============================================================================");
		
	//학생들의 정보를 입력하고, 출력하는 프로그램 적성하기
	//학생들의 수학과 영어성적을 등록하는 프로그램입니다.
	//1. 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받는다.
	//2. 입력받은 수 만큼 학생들의 이름, 수학, 영어성적을 입력받는 프로그램 작성하기

	//예시
	//등록할 인원 수: 2
	//이름 : 홍길동
	//수학 : 90
	//영어 : 85
	//-----
	//이름 : 독고길동
	//수학 : 40
	//영어 : 100
	//------- 2명 등록 완료
	//홍길동 90 85
	//독고길동 90 85
	Scanner scan = new Scanner(System.in);
	
	

	System.out.print("등록 인원수를 입력해주세요 : ");
	int count = scan.nextInt();
	
	String[][] student = new String[count][3];
	
	for(int i =0; i<count;i++) {
		for(int j =0; j<3;j++) {
			
			switch(j){
			case 0 : 
				System.out.println("이름 : ");
				break;
			case 1 : 
				System.out.println("수학 : ");
				break;
			case 2 : 
				System.out.println("영어 : ");
				break;
				
			}
			student[i][j] = scan.next();
		}
		System.out.println("==================");
	}
	System.out.println("==================");
	System.out.println("2명 등록 완료");
	for(int i =0;i<student.length;i++) {
		System.out.println(Arrays.toString(student[i]));
	}
	System.out.println("==================");
	
	
	
	}//end main
}
