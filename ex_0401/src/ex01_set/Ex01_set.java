package ex01_set;

import java.util.HashSet;
import java.util.Random;

public class Ex01_set {
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();
		
		//add(E e)
		//데이터에 추가
		hs1.add("Orange");
		hs1.add("apple");//중복되는 데이터는 추가되지 않는다.
		
		hs1.add(null); //nu;;도 1번 저장이 가능하다.
		
		System.out.println(hs1);//입력순서대로 출력되지는 않는다.
		
		
		//HashSet이 중복되는 요소를 어떻게 체크할까?
		//1. hashcode()로 같은 주소를 가지고 있는지 비교
		//2. 해시값이 같으면 equals()로 실제값을 비교
		//둘다 같으면 삭제
		
		//size()
		//들어있는 요소의 개수
		System.out.println(hs1.size());
		
		//contains(Object o)
		//요소가 포함되어 있는지 판별
		System.out.println(hs1.contains("banana"));
		
		//HasSet을 언제쓰면 좋을까
		//1. 중복되는 데이터가 없이 뽑을 때
		//2. 순서나 정렬이 중요하지 않을 때
		
		//HashSet 객체를 이용하여 로또번호 뽑기
		HashSet<Integer> hs2 = new HashSet<Integer>();
		//1~45 사이의 난수 6개 뽑기
		
		while (hs2.size()!=6) {
			int r = new Random().nextInt(45)+1;
			hs2.add(r);
		}
		System.out.println(hs2);
		
		//인덱스가 없기 때문에 하나만 고를 수가 없다.
		
		//HashSet을 배열 형태로 변환
		
//		Object[] arr = hs2.toArray();
		//형변화이 필요하다 -> 타입안정성이 떨어진다
		
		Integer[] arr = hs2.toArray(new Integer[0]);		

		//왜 Integer에 0을 사용하는 것인가.
		//적절한 크기의 새 배열을 만들어서 반환을 해준다.

		
	}
}
