package ex05_generic;

public class GenericExam {
		//Gen클래스르 만들어 제네릭 타입 T를 가지는
		//printArr 메서드를 생성한다.
		//printArr메서드 내부에서 배열을 순차적으로 출력하는 코드를 작성
		//main 에서 Integer, Double, Character 배열을 만든 뒤
		//Gen클래스의 printArr메서드를 각각 호출하여 배열의 내용을 출력하자
		//결과
		//1 2 3 4 5
		//1.1 2.2 3.3 4.4 5.5
		//A B C D E 
	public static void main(String[] args) {
		Gen num1 = new Gen();
		Gen<Double> num2 = new Gen<Double>();
		Gen<Character> num3 = new Gen<Character>();
		
		Integer[] arr1 = {1,2,3,4,5};
		Double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
		Character[] arr3 = {'A','B','C','D','E'};
		
		//컴파일러가 전달된 인자의 타입을 보고 타입을 추론한다.
		//명시를 해주고 싶으면 앞의 자리에 써주면 된다
		//num1.<Integer>printArr(arr1);
		num1.printArr(arr1);
		num1.printArr(arr2);
		num1.printArr(arr3);
		
			
	}
}
