package ex07_final;

public class Book {
	String titleString = "홍길동전";
	final int PRICE = 25000; //상수 다른 값을 대입할 수 없다.
	//final을 붙여 상수로 쓰면 대문자로 쓴다.
	
	//final 메서드
	//자식 클래스에서 오버라이드 할 수 없다.
	public final void info_title() {
		System.out.println("책의 제목은 : "+titleString+",  가격은 " + PRICE );
	}
}
