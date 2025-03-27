package ex01_inheritance;

public class Main {
	public static void main(String[] args) {
		CalPlus p = new CalPlus();
		CalMinus m = new CalMinus();
		
		System.out.println("CalPlus : " + p.getResult(15, 15));
		
		
		System.out.println("CalMinums : " + m.getResult(30, 15));
		
	}
}
