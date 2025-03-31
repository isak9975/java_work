package ex06_List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex02_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//List의 구현제중 하나이므로 메서드는 동일하다
		//요소의 추가
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		//링크드 리스트에는 index가 없지만, 자바에서는 List 인터페이스를 
		//구현하고 있기 때문에 index로 접글할 수 있도록 기능을 제공
		
		//3번재를 찾아간다.
		//index를 바로 찾는 List와 다르게
		//Linked List의 경우 앞에서부터 노드를 따라가면서
		//해당 위치까지 이동해서 처리를 한다.
		
		//맨 앞/뒤에 추가하기
		list.addFirst("HTML");
		list.addLast("JavaScript");
		
		System.out.println(list);
		
		//조회
		System.out.println(list.get(0));
	
		
	//  		ArrayList vs LinkedList
	//내부구조	 	배열기반         노드구조기반
	//메모리구조	연속된공간		  노드마다 객체+포인터로 연결
	//중간삽입/삭제	느림			  빠름
	//인덱스에 접근 빠름			  느림
	//전체순회     빠름    	      느림
	//성능요약		검색에 강함      삽입/삭제에 강하다.
//  		인덱스에 접근이 많을때  삽입/삭제가 자주 일어날 때
		
		
		
	}
}
