package ex04_overload;

public class Overload {
	public void result() {
		System.out.println("인지가 없는 메서드");
	}
	
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void result(char ch) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	public void result(String s, int n) {
		System.out.println("문자열을 인자로 받는 메서드");
	}
	
	public void result(int n,String s) {
		System.out.println("순서가 다른 인자를 받는 메서드");
	}
}
