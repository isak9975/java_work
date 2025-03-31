package ex06_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		UserInfo userInfo = new UserInfo();
		
		ArrayList<UserInfo> userList = new ArrayList<UserInfo>();
		
		while(true) {
			System.out.print("아이디 생성 : ");
			userInfo.setId(scan.next());
			System.out.print("패스워드 입력 : ");
			userInfo.setPwd(scan.next());
			System.out.println();
			
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