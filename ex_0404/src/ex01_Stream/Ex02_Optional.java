package ex01_Stream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02_Optional {
	public static void main(String[] args) {
		//스트림의 최종결과를 Optional로 반환하는 것들이 있었다.
		//제네릭클래스로 T타입의 객체를 감싸는 Wrapper클래스이다.
		//객체에 담아서 반환을 하므로 결과가 null인지를 단간하게 체크하는 메서드를 제공한다
		//if로 따로 체크하지 않아도 NullPointException이 발생하지 않는 코드 
		
		//참조변수의 값이 null일 간으성이 있으면 of()대신 ofNullof()를 사용
		
		Optional<String> optStr = Optional.of("abcde");
		//optStr에 들어있는 글자의 수를 반환받기
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr=" + optStr.get());
		System.out.println("optInt=" + optInt.get());
		
		//autoBox, unboxing
		int result1 = Optional.of("123")
			.filter(x ->x.length()>0)
			.map(Integer::parseInt)
			.get();
		System.out.println("result=" + result1);
		
//		OptionalInt opionInt = OptionalInt.empty();
//		System.out.println(opionInt.getAsInt());
		
		Optional<String>opt = Optional.ofNullable(null);
		System.out.println("opt=" + opt);
		
		
		//IntStream과 같은 기본형 스트림에는 스트림의 요소들에 대한 통계 정보를
		//얻을 수 잇는 메서드듣이 있다.
		
		//sum()
		int sum2 = IntStream.of(1,2,3,4,5).sum();
		
		//average() 
		OptionalDouble res = IntStream.of(1,2,3,4,5).average();
		System.out.println(res.getAsDouble());
		
		//min()
		IntStream.of(1,2,3,4,5).min();
		
		
		
	}
}

