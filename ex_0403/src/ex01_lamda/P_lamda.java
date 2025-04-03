package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class P_lamda {
	//리스트의 필터 메서드를 만든다
	//숫자 리스트에서 조건을 결합한 결과만 필터링
	//Predicate<Integer>를 사용해 다음 조건을 구현
	//짝수(even)
	//100이상
	//200미만
	public List<Integer> filter(List<Integer>list, Predicate<Integer> condition){
		List<Integer> returnlist = new ArrayList<Integer>();
		
		for(int list1 : list) {
			if(condition.test(list1)) {
				returnlist.add(list1);
			}
		}
		return returnlist;
	}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50,80,120,150,180,210,250,320);
		
		//조건(람다식으로 만들기)
		//Predicate<Integer>를 사용해 다음 조건을 구현
		//짝수(even)
		//100이상
		//200미만
		Predicate<Integer> p1 = t -> t%2==0; 
		Predicate<Integer> p2 = t -> t>=100;
		Predicate<Integer> p3 = t -> t<200;
		
		Predicate<Integer> all = p1.and(p2).and(p3);
		
		//메서드 호출해서 리스트와 조건 넘겨주면 된다.
		
		P_lamda pLamda = new P_lamda();
		List<Integer> returnlist = pLamda.filter(numbers,all);
		
		System.out.println(returnlist);
	}
}
