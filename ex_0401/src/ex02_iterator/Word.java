package ex02_iterator;

import java.util.HashSet;
import java.util.Scanner;

public class Word {
	public static void main(String[] args) {
		//사용자가 입력한 문장에서 단어가 중복되었는지 검사하기
		//예시
		// I love Java and I love coding
		// 중복단어 있음.
		String sen = null;
		Scanner scan = new Scanner(System.in);
//		System.out.print("문장을 입력하세요 : ");
//		sen = scan.next();
		
		sen = "I love Java and I love coding";
		
		String[] arr = sen.split(" ");
		
		HashSet<String> set = new HashSet<>();
		
		int count=0;
		String str = "";
		
		
		//boolean add(E e)
		//잘 들어갔으면 true, 중복되면 false를 반환.
		for(int i=0;i<arr.length;i++) {
			
			if(set.contains(arr[i])) {
				System.out.println("중복단어 있음");
				count++;
				str += arr[i]+", ";
			}
			set.add(arr[i]);
			System.out.println(arr[i]);

		}
		System.out.print("중복단어 : ");
		System.out.println(str);
		System.out.printf("총 %d 개 있음",count);
			
	}
}
