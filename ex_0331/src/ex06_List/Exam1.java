package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
	//아래의 결과를 도출하시오
	//아이디 생성 : abc
	//abc
	//아이디 생성 : abc2
	//abc abc2
	//아이디 생성 : abc3
	//abc abc2 abc3
	//아이디 생성:
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> array = new ArrayList<>();
		
		out:while(true) {
			System.out.print("아이디 생성 : ");
			String name = scan.next();
			
			//중복검사
			for(String x : array) {
				if(array.contains(name)) {
					System.out.println("아이디가 중복됩니다.");
					continue out;
				}
			}
			
			//리스트 추가
			array.add(name);
			//출력
			for(int i = 0;i<array.size();i++) {		
				System.out.print(array.get(i) + " ");	
			}
			
			System.out.println();
			System.out.println();
		}
	
	}	
}
