package ex04_interface;

public class KitchenMain {
	public static void main(String[] args) {
		Ktchen ktchen = new Ktchen();
		System.out.println(ktchen.jajang());
		System.out.println(ktchen.JJamBBong());
		
		Menu1 menu1 = new Ktchen();
		System.out.println(menu1.jajang());
//		System.out.println(menu1.JJamBBong());
		
		Menu2 menu2 = new Ktchen();
//		System.out.println(menu2.jajang());
		System.out.println(menu2.JJamBBong());
	}
}


//추상클래스와 인터페이스의 차이점
//개념적 목적
//추상클래스 : 상속받아서 기능을 확장시키는데 목적
//ㄴ상속받은거 + 자식의 기능을 작성
//인터페이스는 : 구현 객체의 동일한 실행 기능을 보장하기 위한 목적
//ㄴ구현한 클래스 온전히 인터페이스의 기능을 갖추었음을 보장

//인터페이스 사용 예)
//1. 어플리케이션의 기능을 정의해야 한지만 그 구현방식이나 대상에 대해 추상화 할 때.
//2. 서로 관련성이 없는 클래스들을 묶어주고 싶을 때.
//3. 다중 상속을 통한 추상화 서러꼐를 해야할 때.
//4. 특정 데이터 타입의 행동을 명시할 때, 어디서 그 행동이 구현되는지 특정하지 않았을 때
//5. 클래스와 별도로 구현 객체가 같은 동작을 한다는 것을 보장할 때