package ex06_List;

import java.util.ArrayList;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		//사람에 대한 정보를 저장하고 싶다.
		//이름,키,몸무게,주소,혈액형,나이...
		ArrayList<Person>list = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.name = "홍길동";
		person1.age=30;
		person1.height=180.4;
		
		Person person2 = new Person();
		person2.name="홍길순";
		person2.age=64;
		person2.height=160.3;
		
		list.add(person1);
		list.add(person2);
		
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).age);
		System.out.println(list.get(0).height);
		
		System.out.println(list.get(1).name);
		System.out.println(list.get(1).age);
		System.out.println(list.get(1).height);
		
	}
}
