package ex02_exception;

public class Ex02_NumberFormatException {
	public static void main(String[] args) {
		//잘못된 문자열을 숫자로 형변현할 때 발생
		String str01 = "11";
		String str02 = "11.2";
		
		//정수형태의 문자열을 정수로 변경할때는 문제 없음.
		int num01 = Integer.parseInt(str01);
		System.out.println("String to int : " + num01);
		
		//실수 형태의 문자열을 정수로 변환하게 되면 문제가 발생함.		
		int num02 = Integer.parseInt(str02);
		System.out.println("String to int2 : " + num02);
	}
}
