package Access;

import ex05.inheritance.Parent;

public class NotChild {
	void accessText() {
		Parent p2 = new Parent();
		//부모의 자식이 아니기 때문에(상속x) super도 불가능
//		super.accessProtected()
//		p2.accessProtected();
	}
}
