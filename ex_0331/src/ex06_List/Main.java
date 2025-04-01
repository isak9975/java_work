package ex06_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		ArrayList<UserInfo> userList = new ArrayList<UserInfo>();
		
		out:while(true) {
			UserInfo userInfo = new UserInfo();//내부에서 만들어야 돌때마다 초기화.
			System.out.print("아이디 생성 : ");
			String id = scan.next();
			userInfo.setId(id);
			System.out.print("패스워드 입력 : ");
			userInfo.setPwd(scan.next());
			System.out.println();
			
			//중복검사
			for(int i =0;i<userList.size();i++) {
				if(id.equals(userList.get(i).getId())) {
					System.out.println("중복된 아이디 입니다.");
					System.out.println("다시 입력해 주세요");
					continue out;
				}
			}		
			
			userList.add(userInfo);
			
			for(UserInfo arr : userList ) {
				System.out.println(arr.getId());
				System.out.println(arr.getPwd());
				System.out.println("=======================");
			}
		}
		
	}
}
         //setter, getter 말고도 생성자를 통해서 값을 넣는 방법도 있음.
		//대신 한번에 입력해야함.	