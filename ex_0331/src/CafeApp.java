import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {
	public static void main(String[] args) {
		
		ArrayList<Menuitem> list = new ArrayList<Menuitem>();
		
		Scanner sacn = new Scanner(System.in);
		
		Menuitem menuitem = new Menuitem();
		
		while(true) {			
			System.out.println("=== 카페 주문 시스템=== ");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 주문 추가");
			System.out.println("3. 결제 하기");
			System.out.println("4. 취소 하기");
			System.out.println("5. 종료");
			System.out.print("번호 선택 : ");
			int select = sacn.nextInt();
			
			if(select ==1) {
				menuitem.findmenu();
			}
			else if(select==2) {
				menuitem.order(list);
			}
			else if(select==3) {
				menuitem.paid(list);
			}
			else if(select==4) {
				menuitem.cancle(list);
			}
			else{
				System.out.println("프로그램을 종료합니다.");
				return;
			}		
			
		}//end while
		
	}//end main
}//end class
