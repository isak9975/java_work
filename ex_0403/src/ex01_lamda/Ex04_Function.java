package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

class User{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


public class Ex04_Function {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java","Python","C++");
		
		//1. 반복문
		System.out.println("1. 일반 반복분");
		for(int i =0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		//2. 향상된 for문(enhanced for)
		System.out.println("2. 개선된 반복문");
		for(String string : names) {
			System.out.println(string);
		}
		
		//3. forEach()
		System.out.println("3. forEach");
//		names.forEach(x->System.out.println(x));
		names.forEach(System.out::println);
		
		//정적메서드의 참조
		//static이 붙어 있는 메서드
		//객체를 생성하지 않ㄴ아도 사용할 수 있다.
//		Arrays.toString();
		//Integer.parseInt()
//		function<String,Integer> parse = t -> Integer.parseInt(t);
		Function<String,Integer> parse = Integer::parseInt;
		
		int result = parse.apply("123");
		System.out.println("=====================");
		//특정 타입의 인스턴스메서드 참조
		//인스턴스 메서드는 객체를 통해서 호출된 메서드
		//생성자 참조
		//SupplierMArrayList<String> listSupplier 
		Supplier<ArrayList<String>> listSupplier = ArrayList::new;
		
		ArrayList<String> list = listSupplier.get();
		
//		BiFunctim <String,Integer,user>userCreator = User::new;
//		
//		User user = userCreator.apply("Alice",30);
//		
//		System.out.println("==============================");
//		//인스턴스 메서드의 참조
//		//Function<String,Integer> GetLength = s -> s.length;
//		Function<String,integer> GetLength = String::length;
//		
//		System.out.println("무자열의 길이 : " + list legnth);
//		
//		User user2 = new User("홍길동이",30) ;
//		System.out.println(lhllo.apply(u2                             ));
//		
	}//end main
	
	
}//end class


