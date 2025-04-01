import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;

public class Menuitem {
	private String menu;
	private int price;
	
	public void setMenu(String menu) {
		this.menu = menu;
	}public void setPrice(int price) {
		this.price = price;
	}public String getMenu() {
		return menu;
	}public int getPrice() {
		return price;
	}
	Scanner scan = new Scanner(System.in);
	
	//1. 메뉴 보기
	public void findmenu() {
	System.out.println("1. 아메리카노 = 3000원");
	System.out.println("2. 라떼 = 3500원");
	System.out.println("3. 카푸치노 = 4000원");
	System.out.println();
	}
	
	//2.주문 추가
	public void order(ArrayList<Menuitem> list) {
		Menuitem menuitem = new Menuitem();
		System.out.println();
		System.out.print("메뉴 번호 입력 : ");
		
		int select = scan.nextInt();
		if(select ==1) {
			System.out.println("'아메리카노'가 주문에 추가되었습니다");
			System.out.println();
			menuitem.setMenu("아메리카노");
			menuitem.setPrice(3000);
		}
		else if (select ==2) {
			System.out.println("'라떼'가 주문에 추가되었습니다");
			System.out.println();
			menuitem.setMenu("라떼");
			menuitem.setPrice(3500);
		}
		else if (select ==3) {
			System.out.println("'카푸치노'가 주문에 추가되었습니다");
			System.out.println();
			menuitem.setMenu("카푸치노");
			menuitem.setPrice(4000);
		}
		else {
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		list.add(menuitem);
	}
	
	//3. 결제하기
	public void paid(ArrayList<Menuitem> list) {
		int total=0;
		System.out.println("[결제 내역]");
		for(int i =0;i<list.size();i++) {
		System.out.println("-"+list.get(i).getMenu());
		total += list.get(i).getPrice();
		}
		System.out.println("총 금액 : "+total+"원");
		list.clear();
		System.out.println("결제가 완료되었습니다. 감사합니다!");
		System.out.println();
	}
	
	//4. 취소하기
	//oderList가 미어있으면
	//줌누내역이 없습니다 출력
	//비어 있지 않으면
	//[현재 주문 내역]
	
	//취소할 주문 번호를 입력하세요
	//orderList에서 remove하면 된다.
	public void cancle(ArrayList<Menuitem> list){
		if(list.isEmpty()) {
			System.out.println();
			System.out.println("주문 내역이 없습니다");
			System.out.println();
		}else {
			System.out.println();
			System.out.println("[현재 주문 내역]");
			for(int i=0;i<list.size();i++) {
				System.out.printf("%d. %s - %d 원\n",i+1,list.get(i).getMenu(),list.get(i).price);
			}
			System.out.print("취소할 주문 번호를 입력하세요 : ");
			int select = scan.nextInt();
			if(select >=1 && select<=list.size()) {
				System.out.println(list.remove(select-1));
				System.out.println("삭제가 완료 되었습니다.");
			}else {
				System.out.println("잘못된 번호입니다.");
			}
			
		}
	}
	
}
