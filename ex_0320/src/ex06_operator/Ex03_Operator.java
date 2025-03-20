package ex06_operator;

public class Ex03_Operator {
	public static void main(String[] args) {
	
		int a = 10; //1010
		int b = 2;	//0010
		int c = a&b; //0010
		System.out.println(c); //2 => and 연산이기때문
		
		
		int a2 =12; //1100
		int b2 = 8; //1000
		int c2 = a2 | b2; //1100
		System.out.println(c2); //12 => or 연산이기때문
		
		
		int a3 = 9; //1001
		int b3 = 11; //1011
		int c3 = a3 ^ b3; //0010
		System.out.println(c3);//2
		
		int x = 7;//0111
		System.out.println(~x);//1000
		//~x -> -(x+1)
		
		
		x = 10;//1010
		int result = x<<1;//20
		System.out.println(result);
		int result1 = x>>1;//5
		System.out.println(result1);
		
		
		//삼항연산자
		//조건식? 참일  때 실행할 명령 : 거짓일때 실행할 명령;
		int i = 10;
		int i2 = 15;
		result = ++a >= b ? 1:0;
		System.out.println(result);
		
		
	}
	
	
}
