package ex05_generic;

//제네릭에 들어올 수 있는 타입을 숫자로 제한.
	//Number의 자식 클래스만 들어와라.
class Calculator<T extends Number>{
	void add(T a,T b) {};
	void sub(T a,T b) {};
	void mul(T a,T b) {};
	void div(T a,T b) {};
}

public class Ex03_Generic {
	public static void main(String[] args) {
//		Calculator<Object> cal1 = new Calculator();
//		Calculator<String> cal2 = new Calculator();
		Calculator<Integer> cal3= new Calculator();
		Calculator<Double> cal4= new Calculator();
		
		
		
	}
}
