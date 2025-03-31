package ex05_generic;

import java.util.List;

public class DataListExcample {
	public static void main(String[] args) {
		//객체가 만들어지면서 배열을 같이 생성
		//클래스에 제네릭을 부여하게 되면 해당 클래스를 선언할때
		//데이터 타입을 부여하게 된다.
		
		//제네릭의 타입변수는 기본자료형을 인식하지 않는다.
		//따라서 int, double 등의 기본자료형을 제네릭 타입으로 이용하고자 하면
		//Integer, Double 등의 클래스를 이용해야 한다.
		DataList<Integer> list = new DataList();
		
		//제레릭으로 Integer로 만들어서 정수타입만 가능하게 된다.
		list.add(10);
		list.add(20);
		list.add(45);
		
		int sum = 0;
		for(int i =0; i<list.size() ;i++) {
			sum +=list.get(i);		
		}//end for
		System.out.println(sum);
		
		DataList<String> list2 = new DataList<String>();
		
		
	}
}
