package ex01_Collections;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Ex01_Collections {
	public static void main(String[] args) {
		//Clooections
		//Java에서 컬렉션을 다룰 때 유요한 기능들을 제공하는 클래스
		//java.util.Collections 패키지에 포함되어 있으며
		//모든 메서드는 정적메서드이다.
		
		//sort()
		//리스트의 요소를 오름차순으로 정렬
		List<Integer> numbers = Arrays.asList(4,2,9,3,6,7,1,8);
		Collections.sort(numbers);
		
		//reverse(list)
		//리스트 요소의 순서를 내림차순으로 정렬
		Collections.reverse(numbers);
		System.out.println("정렬 후 : "+numbers);
		
		//min(Collections c)
		//컬렉션에서 최소값을 찾는다.
		int min = Collections.min(numbers);
		System.out.println("최소값 : "+min);
		
		//max(Collections c)
		int max = Collections.max(numbers);
		System.out.println("최대값 : "+max);
		
		//set이나 map은 list로 변환한 다음 사용해야한다.
		
		
		
		//가장 많이 주문된 상품 구하기
		//각 사용자는 여러 상품을 주문할 수 있으며,
		//주문 내역은 ArrayList에 문자열 형태로 저장이 되고
		//"사용자 이름:상품이름"형태로 저장이 된다
		//가장 많이 주문도니 상품 이름과 줌누 수량을 출력하세요
		//List<string> orders = Arrays.asList("Alice:TV","Bob:TV","Alice:Phone", "Charlie:TV",
		//"Dacid:Tablet","Eve:Phone", "Frank:Phone","Alice:Phone"
		//)""=>phone=>4
		
		List<String> orders = Arrays.asList("Alice:TV","Bob:TV","Alice:Phone", "Charlie:TV", "Dacid:Tablet","Eve:Phone", "Frank:Phone","Alice:Phone");
		
		HashMap<String, Integer> str = new HashMap<String, Integer>();
		
		for(int i=0;i<orders.size();i++) {
			
			
			if(str.containsKey(orders.get(i).split(":")[1])) {
				
				int count = str.get(orders.get(i).split(":")[1]).intValue();
				str.put(orders.get(i).split(":")[1],count+1);
			}else {
				str.put(orders.get(i).split(":")[1],1);	
			}
			 
		}
		int max1=0;
		String name=null;
	
		for(Entry<String, Integer> i: str.entrySet()) {
			System.out.println(i);
			if(i.getValue()>max1) {
				max1 = i.getValue();
				name = i.getKey();
			}
		}
		System.out.println(name+" "+max1);
		
		
		
//		✅ 문제 설명
//		당신은 학교 성적 분석 시스템을 개발하고 있다.
//		주어진 학생 성적 데이터를 기반으로, 각 학생의 평균 점수를 계산한 후,
//		가장 평균 점수가 높은 학생의 이름과 평균 점수를 출력하는 프로그램을 작성하라.
//
//		🧾 데이터 설명
//		각 데이터는 "이름:과목:점수" 형식의 문자열로 주어진다.
//		예: "Alice:Math:85"는 Alice라는 학생이 Math 과목에서 85점을 받았다는 뜻이다.
//
//		📋 요구 사항
//		학생 정보를 관리하는 Student 클래스를 설계하라.
//
//		이름(name), 총점(totalScore), 과목 수(subjectCount)를 필드로 가진다.
//
//		점수를 추가하는 addScore(int score) 메서드를 정의하라.
//
//		평균을 반환하는 getAverage() 메서드를 정의하라.
//
//		이름을 반환하는 getName() 메서드를 정의하라.
//
//		주어진 성적 리스트를 활용하여, 이름별로 Student 객체를 생성하고 점수를 누적하라.
//
//		모든 학생 중에서 평균 점수가 가장 높은 학생의 이름과 평균 점수를 출력하라.
//
//		평균 점수는 소수점 한 자리 이상 나오도록 출력해도 무방하다.
		
////		List<String> scores = Arrays.asList(
////			    "Alice:Math:85", "Alice:English:78",
////			    "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
////			    "Charlie:Math:70", "Charlie:English:60"
//			);
//		
		
	}
	
}
