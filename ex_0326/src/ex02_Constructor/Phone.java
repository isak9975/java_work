package ex02_Constructor;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	//생성자 선언
	//자바에서는 외부에서 제공할 수 있는 데이터만큼만 매개 변수로 전달하여
	//객체를 생성할 수 있다.
	//생성자를 다양한 형태로 생성하는 것을 '생성자 오버로딩'이라고 한다.
	
	//오버로딩 규칙
	//1. 매개변수의 개수가 다를때
	//2. 매개변수의 개수가 같아도 자료형이 다를때
	//3. 생성자나 메서드의 이름은 그래도 사용하기
	public Phone(String b,int s) {
		brand = b;
		series = s;
	}
	public Phone(String b, int s, String c) {
		brand = b;
		series = s;
		color = c;
	}
	
	//메서드 선언
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
