package ex05_generic;

public class GenMain {
	public static void main(String[] args) {
		//객체를 만들때 제네릭의 타입이 결정된다.
		//한가지의 클래스로 여러가지의 타입을 받을 수 있다.
		GenEx<Integer> v1 = new GenEx<Integer>();
		v1.setValue(100);
		
		System.out.println(v1.getValue());
		
		GenEx<String> v2 = new GenEx<>();
		
		v2.setValue("홍길동");
		System.out.println(v2.getValue());
	}
}