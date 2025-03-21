package ex01_if;

public class ex03_if_elseif_else {
	public static void main(String[] args) {
		//비교해야할 조건이 여러개 있는 경우 사용하는 문법
		//if문안에 두개 이상의 조건식과 논리연산자를 사용할수도 있지만
		//더욱 코드를 간결하게 하고 가독성을 높이기 위한 방법으로
		//if.else if문을 구현한다.
		
		int num = 5;
		if(num%2 ==1 &&  num  %5 ==0);
		
		//if(조건식1){
		//	조건식1이 참일 때 실행할 명령
		//}else if(조건식2){
		//	조건식1이 거짓이고 2가 참일때
		//}else if(조건식3){
		//	조건식1,2,가 거짓이고 3이 참일때
		//}else {
		//	위의 조건이 모두 거짓일 때 실행할 문장.
		//}
		
		//else-if 문의 개수에는 제한이 없다.
		//하지만 너무 많은 else-if문을 사용한다면
		//프로그램의 실행 속도가 현저히 느려질 수 있기 때문에
		//다른 방법을 함께 고려해야한다.
		//else문은 필요없다면 생략이 가능하다
		
		
		int favorite = 7;
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		}else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다");
		}
		//효율적인 프름으로 제어하기 위해 if문과 else if문의 조건문의
		//위치를 잘 고려해야한다.
	}

}
