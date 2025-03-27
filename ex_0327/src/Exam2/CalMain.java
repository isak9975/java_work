package Exam2;

public class CalMain {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		Calc c = new Calc();
		System.out.println(c.add(10,5));
		System.out.println(c.substract(10, 5));
		System.out.println(c.average(a));
	}
	
}
