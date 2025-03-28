package ex01_innerClass;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
		
		//person 클래스를 확장하기 위해서는 여러가지 클래스를 만들어서 상속을 줘야한다.
		//하지만 한번만 사용할거라면 익명클래스를 사용해서 간소활 할수 있다.
		Persion persion = new Persion() {
			@Override
			public void mySelf() {
				System.out.println("저는 회사원입니다");
			}
		};
		persion.mySelf();
		
	}
}
