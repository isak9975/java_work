package ex01_StringBuilder;

public class Ex01_StringBuilder {
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("Hello ");
		
		//StringBuilder 명령어들은 String 명령어와 다르게 기존 문자열에 영향을 준다.
		//변경이 자주 일어날경우 Stirng보다 StringBuiler를 사용하는게 좋다.
		
		//append()
		//기존 문자열의 뒤에 삽입
		stringBuilder.append("World");
		System.out.println(stringBuilder);
		System.out.println("문자열의 길이 : "+stringBuilder.length());
		
		//delete()
		//문자열 삭제
		stringBuilder.delete(0, 6);
		System.out.println(stringBuilder);
		
		//insert()
		//원하는 위치에 문자열 삽입
		stringBuilder.insert(0, "hello ");
		System.out.println(stringBuilder);
		
		//reverse()
		//문자열을 뒤집어서 출력
		stringBuilder.reverse();
		System.out.println(stringBuilder);
	}
}
