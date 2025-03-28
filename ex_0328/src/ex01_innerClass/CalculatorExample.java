package ex01_innerClass;

class Calculator{
	private int val1;
	private int val2;
	
	public Calculator(int val1, int val2 ) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public class Calc{
		public int add() {
			return val1+val2;
		}
	}
	
}

public class CalculatorExample {
	public static void main(String[] args) {
		//외부클래스의 객체
		Calculator calculator = new Calculator(10, 5);
		
		//내부클래스의 객체
		Calculator.Calc calc = calculator.new Calc();
		
		System.out.println();
	}
}
