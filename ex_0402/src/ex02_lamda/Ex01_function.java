package ex02_lamda;

public class Ex01_function {
	
	public static void main(String[] args) {
		Iadd add = (x,y) -> x+y;
		int res = result(add);
		System.out.println("res : "+res);
		
		
		//Iadd를 구현한 구현체는 다 대입이 가능하다

	}
	
	
	
	//람다식을 매개변수로 받을 수 있다.
	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}
	
	
	
}

