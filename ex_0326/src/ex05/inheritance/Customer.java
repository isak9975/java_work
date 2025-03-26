package ex05.inheritance;

//자식 클래스
public class Customer extends Person{
	int memberId;
		
	public Customer(String name,int age,int memberId) {
		//super(); 부모 생성자의 호출
		super(name,age);
		this.memberId = memberId;
	}
	
	void enter() {
		System.out.println("회원번호 : " + memberId + "("+name+", "+age+ "세) 님이 입장하셨습니다");
	}
	
}
