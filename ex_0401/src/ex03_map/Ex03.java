package ex03_map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//문장을 입력받고 단어별로 몇번 등장했는지 출력하세요
		//예시
		//hello world hello java world java java
		//hello : 2
		//world : 2
		//java : 3
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문장 입력 : ");
//		String str  = scan.nextLine();
		String str = "hello world hello java world java java";
		
		String[] arr = str.split(" ");
	
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String i : arr) {
//			if(wordCount.containsKey(arr)) {
//				//이미 키가 존재한다면 값 1증가
//				int count = wordCount.get(i);
//				wordCount.put(i, count+1);
//			}else {
//				//단어가 처음 나왔을 때
//				wordCount.put(i, 1);
//			}
			wordCount.put(i, wordCount.getOrDefault(i, 0)+1);
		}//end for
		
		System.out.println("단어별 등장 횟수");
		for(String key:wordCount.keySet()) {
			System.out.println(key + " : " + wordCount.get(key));
		}
		
		//Map인터페이스에서 제공하는 메서드
		//V getOrDefault(K key, defaultValue)
		//키가 존재하면 Value를 반환
		//키가 존재하지 않으면 defaultValue를 반환한다.
		
		//V replace(K key, V value)
		//put은 키가 없으면 추가가된다.
		//replace는 키가 없으면 추가는 안된다.
	
		//V putIfAbsent(K key,V value)
		//키가 없을 경우에만 추가
		
		//키가 있을 경우 put() -> 덮어쓰기
		//putItAbsent() -> 아무 동작도 하지 않는다.
		
	}
}
