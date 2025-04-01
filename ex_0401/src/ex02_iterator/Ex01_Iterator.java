package ex02_iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

public class Ex01_Iterator {
	//반복자라고도 불리는 iterator객체
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//반환형이 List라서 위 상황처럼 만들수 있는것이다.
		
		Iterator<Integer> iter = list.iterator();
		
		//Iterator 메서드
		//boolean hasNext()
			//다음값이 있으면 true, 없으면 false
		//E next()
			//다음값을 반환
		
		while(iter.hasNext()) {//
			int val = iter.next();
			System.out.println(val);
		}
		
//==================================================================================
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i =0; i<=10;i++) {
			set.add(i);
		}
		
		Iterator<Integer> iter2 = set.iterator();
		
		
		while(iter2.hasNext()) {
			int val = iter2.next();
			System.out.println(val);
		}
		
		//Iterable(Iterator) -> Collection -> List
  		//					           	   -> Set
		//이런식의 상속 구조로 List와 Set이 Iterator를 사용할 수 있다.
		
	}
}
