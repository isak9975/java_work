package ex03_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//학생별 국어, 영어, 수학 점수 저장 및 평균 계산
		//학생 이름을 입력받고, 해당 학생의 국어, 영어, 수학 점수를 입력받는다
		//3명의 학생 정보를 입력받은 후, 각 학생의 평균 점수를 계산하여 출력하시오
		
	      //학생 이름: 홍길동
//	      국어 점수: 90
//	      영어 점수: 85
//	      수학 점수: 88
//
//	      학생 이름: 김영희
//	      국어 점수: 100
//	      영어 점수: 95
//	      수학 점수: 90
//
//	      학생 이름: 이철수
//	      국어 점수: 80
//	      영어 점수: 70
//	      수학 점수: 75
//
//	      학생별 평균 점수:
//	      홍길동 - 평균: 87.66666666666667
//	      김영희 - 평균: 95.0
//	      이철수 - 평균: 75.0
		
		Scanner scan = new Scanner(System.in);
		HashMap<String,ArrayList<Integer>> map = new HashMap<>();
		
		for(int i =0;i<3;i++) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("국어 점수를 입력하세요");
		int kor = scan.nextInt();
		l1.add(kor);
		System.out.println("영어 점수를 입력하세요");
		int en = scan.nextInt();
		l1.add(en);
		System.out.println("수학 점수를 입력하세요");
		int math = scan.nextInt();
		l1.add(math);
		map.put(name,l1);
		System.out.println(map);
		}
		
		System.out.println("학생별 평균 점수");
		
		for(String key :map.keySet()) {
			double result = (double)(map.get(key).get(0)+map.get(key).get(1)+map.get(key).get(2));
			System.out.println(key+"- 평균 : "+(result/3));
		}
		
		for(Entry<String,ArrayList<Integer>> is : map.entrySet()) {
			System.out.println(is.getKey());
			System.out.println(is.getValue());
		}		
	}//end main
}//end class
