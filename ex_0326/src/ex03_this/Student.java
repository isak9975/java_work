package ex03_this;

public class Student {
	//함수나 생성자에서 매개변수는 클래스의 필드보다 우선순위가 높아서, 대입연산자를 기준으로
	//왼쪽/ 오른쪽 변수 모두 매개 변수를 뜻하게 된다. ex) money = money
	
	//이때 사용하는 것이 this 이다.
	//객체 자기 자신 스스로 참조
	//this 참조 변수는 객체가 자기 자신을 참조하는데 사용하는 변수이다.
	//this를 필드에 붙여서 사용하면, 중괄호{}안에서도 같은 이름의 매개변수와 필드를 
	//구분해서 사용 할 수 있다. ex) this.money = money
	
	String name;
	int age;
	int studentID;
	
	public Student(String name,int age,int studentID) {
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
}
