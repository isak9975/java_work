package ex04_casting;

public class Ex04_casting {
	public static void main(String[] args) {
	//실수 -> 정수 강제 형변환했을때
		//float -> int 강제 형변환
		float f1 = 12345.67f;
		int i1 = (int)f1;
		System.out.println("f1의 값 : " + f1 + ", i1의 값 : " + i1);
		
		
		//double -> int 강제 형변환
		double d1 =12345.67;
		int i2 = (int)d1;
		System.out.println("d1의 값 : " + d1 + ", i2의 값 : " + i2);
		
		byte b1 = 100;
		byte b2 = 20;
		
//		byte b3 = b1 + b2; => error!
		byte b3 = (byte)(b1+b2);
		
		
		//byte 의 표현  범위가 127까지 밖에 되지 않다보니
		//byte 끼리의 연산은 127을 넘어버릴 가능성이 높다.
		
		//java 개발자들은 byte 의 연산을 수행될 때
		//int 형 변수로 값을 받도록 만든다
		
		
	}

}
