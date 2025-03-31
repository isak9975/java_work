package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam2 {
	//products라는 이름의 ArrayList를 만들고
	//키보드에서 값을 입력받아 상품을 추가한다.(조회)0
	//상품이 중복되면 제거한다.
	//최근 조회한 상품목록이 가장 앞에 나오도록 한다.
	public static void main(String[] args) {
		ArrayList<String> product = new ArrayList<>();
		Exam2 exam2 = new Exam2();
		exam2.viewProduct(product);
	}
	//viewProduct
	
	public void viewProduct(ArrayList<String> arr) {
		Scanner scan = new Scanner(System.in);
		
		
		
		out:while(true) {
			
			System.out.print("상품명을 입력해주세요 : ");
			String product = scan.next();
			System.out.println();
			

			for(String str : arr) {
				if(arr.contains(product)) {
					System.out.println("중복된 값입니다.");
					System.out.println("제품을 제거합니다");
					arr.remove(product);
					continue out;
				}
			}
		
		//제품 추가
		arr.add(product);
		
				
		//제품 출력
		for(int i = arr.size(); i>0;i--) {
			
			System.out.print(i+". "+arr.get(i-1) + " \n");
			}//end for
		}//end while

		
	}//end method
	
}//end class


