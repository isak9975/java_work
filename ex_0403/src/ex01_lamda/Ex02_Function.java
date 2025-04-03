package ex01_lamda;

import java.util.function.Function;

import org.w3c.dom.DOMStringList;

public class Ex02_Function {
	public static void main(String[] args) {
		//문자열을 16진수로 만들기
		Function<String,Integer> f = (s) -> Integer.parseInt(s,16);
		
		//16진수르 2진수로 만들기
		Function<Integer,String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String,String> h = f.andThen(g);//?
		Function<Integer, Integer> h2 = f.compose(g);//?
		
		System.out.println(h.apply("ff"));//FF->255->"111111111"
		System.out.println(h2.apply(2));//2 -> "10" -> 16
		
		
	}
}
