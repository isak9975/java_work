package ex01_if;



public class Ex04_multi_if {
	public static void main(String[] args) {
		//if문의 중첩
		//제어문은 자유롭게 중첩해서 사용할 수 있다.
		
		//if(조건식1){
		//	if(조건식2){
		//		조건식1과 2가 모두 참이어야 실행할 명령
		//	}
		//}
		
		//1. boolean 변수는 ==true/ ==false 없이 사용
		
		//2.조건을 메서드로 추출
//		if(isAccessilbeAdmin) {
//			
//		}
		
		//3. 메서드 안에서 조건에 맞지 않으면 
		//return 을 사용해서 빠져나오기
		
		
	}//end main
	
	//2.
//	public boolean isAccessilbeAdmin(User user){
//		return user != null && user.isActice() && user.getRole() ;
//	}
	//3.
//	public void proccess(User user) {
//		if(user == null)return;
//		if(!user.isActice())return;
//		if(user.hasPermission())return;
//		//do something
//	}
	
}//end class

