package ex02_steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exam1 {
	public static void main(String[] args) {
		//짝수만 출력하기
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
			numbers.stream().filter(t -> t%2==0).forEach(System.out::print);
			System.out.println();
			System.out.println("===================");
		
		//문자열대문자로 변환하여 리스트로 수집하기
		List<String> words = Arrays.asList("java","streram","lamda");
			List<String>result= words.stream().map(t ->t.toUpperCase()).collect(Collectors.toList());
			System.out.println(result);
		
	}
}
