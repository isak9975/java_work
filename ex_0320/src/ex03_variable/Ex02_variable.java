package ex03_variable;

public class Ex02_variable {//클래스의 코드 블럭
	public static void main(String[] args) {//코드블럭
		//변수의 유효범위(scope)
		//모든 변수는 만들어진 중괄호 안에서만 사용할 수 있다.
		String favoriteFood;
		
		if(10>5) {
			favoriteFood = "제육";
		}
	}
	//favoritedFood = '제육' => 블럭 밖이라 오류
}
