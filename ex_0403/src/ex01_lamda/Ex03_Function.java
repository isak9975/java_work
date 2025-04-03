package ex01_lamda;

import java.util.function.Predicate;

public class Ex03_Function {
	public static void main(String[] args) {
		//Predicate의 결합
		//boolean test(T t)
		Predicate<Integer> p = i -> i<100;
		Predicate<Integer> q = i -> i<200;
		Predicate<Integer> r = i -> i%2==0;
		
		int x=150;
		//and() p and r (100미만이면서 짝수면 true)
		boolean result = p.and(r).test(x);
		System.out.println("x<100 and 짝수인가? : "+result ); //false
		//or() p or q(100미만이거나 또는 200미만이면 참(
		result = p.or(q).test(x);
		System.out.println("x<100 또는 x<200 ? : " + result); //true
		//negate() not p (100 이상이면 참)
		result = p.negate().test(x);
		System.out.println("x >= 100 ? : " + result); // ;
		
		
		
		
		
	}
}
