package ex01_innerClass;

public class PermitExample {
	private class InClass{
		public void print() {
			System.out.println("접근을 pricate으로 제한한다.");
		}
	}//end InCalss
	
	public InClass getInClass() {
		return new InClass();
	}//end getInClass()
	
	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		//InClass가 pricate이라서 내부 클래스의 객체를
		//wlrwjq aksemf tn djqtek.
		//PermitExample.InClass = permit.new InClass();
		
		permit.getInClass().print();
	}//end main
	
}//end class
