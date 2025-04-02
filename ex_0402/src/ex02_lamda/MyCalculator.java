package ex02_lamda;

@FunctionalInterface //어노테이션을 선언한 순간 인터페이스에는 무조건 1개의 추상메서드가 있어야한다.
//0개도 안되고 2개도 안된다.

public interface MyCalculator {
	int plus(int num1, int  num2);
}
