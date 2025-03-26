package ex04_overload;

public class RectangleCalculator {
	//다양한 방식으로 사각형의 넓이 구하기
	//정사각형의 한 변의 길이를 받아 넓이 반환하기
	//메서드명 : area
	
	//1. 정사각형의 한 변의 길이를 받아 넓이 반환하기
	public void area(int a) {
		System.out.println("정사각형의 넓이는 "+(a*a)+"입니다");
		System.out.println("=======================================");
	}
	//2. 가로 세로 길이를 받아 직사각형의 넓이 반환하기
	public void area(int a,int b) {
		System.out.println("직사각형의 넓이는 "+(a*b)+"입니다");
		System.out.println("=======================================");
	}
	//3. 실수형 가로, 세로를 받아 실수 결과 반환하기
	public void area(double a,double b) {
		System.out.println("직사각형의 넓이는 "+(a*b)+"입니다");
		System.out.println("=======================================");
	}
}
