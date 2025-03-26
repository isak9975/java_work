package Access;

import ex05.inheritance.Parent;

public class Child extends Parent{
	
	void accessTest() {
		//protected 키워드가 붙은 메서드도 이런식으로 접근이 가능하다.(상속)
		super.accessProtected();
	}
	
	Parent p1 = new Parent();
	//아무리 자식 클래스라도 부모클래스의 개체를 직접 만들어서 접근할수 없다.
//	p1.accessProtected(); 
}
