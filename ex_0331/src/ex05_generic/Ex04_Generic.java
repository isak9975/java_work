package ex05_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04_Generic {
	public static void main(String[] args) {
		//리스트에 123을 넣고 시작하는 방법
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
		//형변환이 불가능하기 때문에 불가능
		print(list);
	}
	
//와일드 카드
	
//<?> : 정확히 타입을 모를 때 사용
//<T> : 정의하는 시점에서 사용
	
	//와일드 카드의 경우는 메서드의 매개변수의 타입으로 사용하는 것이 일반적이다.
//<?> 구체적인 타입으로 모든 클래스나 인터페이스 올수 있다.
//<? extend 상위 타입>
//<? super 하위 타입>
	//<?> = 타입 상관없이 모두 허용한다.
	//<? extends Number> = Number와 와 그 자식클래스 까지만 허용한다.
	//<? super Integer> = Integer를 포함한 부모타입까지만 허용하낟.
	public static void print(List<?> list) {
		for(Object e : list) {
			System.out.println(e);
		}
	}
	
}
