package ex04_overload;

public class OverloadMain {
	public static void main(String[] args) {
		Overload over = new Overload();
		
		//같은 이름이지만 인자에 따라 다른 기능을 하는 메서드를 만들 수 있다.
		over.result();
		
		over.result(5);
		
		over.result('c');
		
		over.result("안녕",1);
		
		over.result(1,"안녕");
	}
}
