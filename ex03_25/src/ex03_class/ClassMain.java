package ex03_class;

import java.awt.font.GraphicAttribute;

public class ClassMain {
	public static void main(String[] args) {
		//자동차 객체 c를 만든다.
		Car car = new Car();
		//클래스에 선언된 필드를 사용하는법.
		System.out.println("바퀴의 개수는"+car.wheel+"입니다");
		
		
		//구현한 메서드를 사용하는 방법은 필드의 사용법과 동일하다.
		//다른 클래스에서 메서드를 사용하려면 객체를 생성한 후
		//참조변수를 이용해 그 객체의 메서드를 사용해야 한다.
		//객체명.메서드명();
		car.ride();
		car.ride();car.ride();car.ride();car.ride();car.ride();
		
		//메서드를 한번 선언해 두면 필요할 때마다 여러 번 호출하여
		//즉, 메서드를 사용하면 반복적인 프로그래밍을
		//보다 쉽고 간단하게 해결할 수 있다.
		
		Family father = new Family();
		Family son = new Family();
				
		//정적 변순느 클래스명.필드명을 통해 대입이나 출력을 한다.
		Family.address = "인천";
		System.out.println(son.address);
		
		//정적 변수와 정적메서드의 경우에는
		//객체 생성없이 사용할 수 있다.
		System.out.println(Student.schoolName);
		Student.goToSchool();
		
		//필드
		//일반필드 -> 객체마다의 상태(이름,나이,직업,키,몸무게,주소,mbti)
		//정적필드 -> 객체 공통의 상태(눈,코,입,손가락
		
		//메서드
		//ㄴ메서드는 메서드 안에서 정의할 수 없다.
		//ㄴ메서드는 메서드 안에서만 호출할 수 있다.
		
		
		 Student student = new Student();
		 student.hello();
		 student.studentName = "홍길동";
		 student.hello();
		 
		 MethodTest methodTest = new MethodTest();
		 int[] arr = {1,4,7,2,6,11,3,9};
		 System.out.println(methodTest.maxFinder(arr));
		 
System.out.println("=========================================");
		
		methodTest.circleArea(5);
		System.out.println("원의 둘레 : "+methodTest.circleRound(6));
		
System.out.println("=========================================");

	System.out.println(methodTest.calculator(10, 5, "+"));		
	System.out.println(methodTest.calculator(10, 5, "-"));
	System.out.println(methodTest.calculator(10, 5, "/"));
	System.out.println(methodTest.calculator(10, 5, "*"));
	
System.out.println("=========================================");

//	methodTest.check();
	
System.out.println("=========================================");	

	Graph g = new Graph();
	g.PrintGraph();

		
	}//end main
}
