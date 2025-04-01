package ex03_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<String , Integer> map = new HashMap<String, Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		
		//id : aaa
		//pw : 1111
		//아이디가 존재하지 않습니다
		
		//id : aaa
		//pw : 1111
		//비밀번호 불일치
		
		//id : aaa
		//pw : 1111
		//로그인 성공
		
		out:while(true) {
			System.out.print("id : ");
			String id  = scan.next();
			System.out.print("pw : ");
			int pw = scan.nextInt();
			
			if(map.containsKey(id)&&map.get(id).intValue()==pw) {			
				System.out.println("로그인 성공");
				return;
			}

			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 않습니다");
				System.out.println();
				continue out;
			}
			else if(!map.containsValue(pw)) {
				System.out.println("비밀번호 불일치");
				System.out.println();
				continue out;
			}
			
		}
	}
}
