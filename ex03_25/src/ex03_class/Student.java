package ex03_class;

public class Student {
	//정적 필드
	static String schoolName="한국 고등학교";
	
	//일반 필드
	String studentName;
	
	//정적 메서드
	static void goToSchool() {
		System.out.println("학교에 갑니다");
	}
	
	//일반 메서드
	public void hello() {
		System.out.println("안녕하세요 제 이름은 "+studentName+"입니다");
	}
}
