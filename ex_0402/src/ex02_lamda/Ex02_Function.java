package ex02_lamda;

public class Ex02_Function {
	public static void main(String[] args) {
		FunctionExam functionExam = new FunctionExam();
		
		Iminus im = functionExam.makeFunction(); //(x,y) -> x-y //람다식이라 다 가져옴.
		Iminus im2 = (x,y) -> x-y; //이거랑 같은 상황 //평범한 람다식 선언.
		System.out.println(im.sub(3, 1));
		
		
	}
}
