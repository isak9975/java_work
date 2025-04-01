import java.util.ArrayList;
import java.util.Scanner;

public class PersonFuncion {
	Scanner scan = new Scanner(System.in);
	
	public void personFunc(ArrayList<Person> list) {
		System.out.println("1. 정보추가");
		System.out.println("2. 정보삭제");
		System.out.println("3. 전체정보");
		System.out.println("4. 종  료");
		System.out.print("항목 선택 : ");
		int select = scan.nextInt();
		if(select==1) {
			Person person = new Person();
			System.out.println("-----정보추가-----");
			System.out.print("이름 : ");
			person.setName(scan.next());
			System.out.print("나이 : ");
			person.setAge(scan.nextInt());
			System.out.print("전화 : ");
			person.setPhone(scan.next());
			list.add(person);
			System.out.println("정보가 저장되었습니다.");
			System.out.println();
		}else if(select==2) {
			System.out.println("-----정보삭제-----");
			
			if(list.isEmpty()) {
				System.out.println("삭제할 정보가 없습니다.");
				System.out.println();
				return;
			}
			
			for(int i =0;i<list.size();i++) {
				System.out.println((i+1)+". 이름 : "+list.get(i).getName());
			}
			System.out.println("삭제할 정보의 번호를 입력해주세요");
			int select1 = scan.nextInt();
			if(select1>=1&&select1<=list.size()) {
				list.remove(select1-1);
				System.out.println("삭제가 완료 되었습니다");
			}else {
				System.out.println("잘못된 번호입니다.");
			}
			System.out.println();
		}else if(select==3) {
			System.out.println();
			System.out.println("-----전체정보-----");
			System.out.println("등록인원 "+list.size()+"명");
			for(int i =0;i<list.size();i++) {
				System.out.println("이름 : "+list.get(i).getName());
				System.out.println("나이 : "+list.get(i).getAge());
				System.out.println("전화번호 : "+list.get(i).getPhone());
				System.out.println("=====================");
			}
			System.out.println();
		}else if(select==4) {
			return;
		}else{
			System.out.println("잘못 선택하셨습니다.");
			System.out.println();
		}
		
	}//end method
}//end class
