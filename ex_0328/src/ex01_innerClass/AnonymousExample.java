package ex01_innerClass;

interface ButtonClickListner{
	public void click();
}

public class AnonymousExample{
	
	public class Button{
		private ButtonClickListner listner;
		
		public void setListner(ButtonClickListner listner) {
			this.listner = listner;
		}//end method
		
		public void click() {
			if(listner !=null) {
				this.listner.click();
			}
		}//end method
		
	}//end Button
	
	
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
	
		//익명클래스
		//인터페이스 구현을 객체 생성과 동시에 함.
		button.setListner(new ButtonClickListner() {
			@Override
			public void click() {
				System.out.println("버튼 클리됨");
				
			}
		});
		button.click();
	}
	
	
}//end class

//ctrl + shift +p 반대 중괄호로 이동