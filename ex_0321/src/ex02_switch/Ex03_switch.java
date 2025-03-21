package ex02_switch;

public class Ex03_switch {
	public static void main(String[] args) {
		//java 12이상으로 업데이트 되면서
		//switch 의 문법이 새롭게 만들어졌다.
		//조건절에 복수개의 값을 사용하는것이 가능해졌다.
		//화살표 표현식을 이용하는게 가능하다.
		
		String day = "Sunday";
		
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wendsday":
		case "Thursday" :
		case "Friday":
			System.out.println("평일");
			break;
		case"Saturday":
		case"Sunday":
			System.out.println("주말");
			break;
		default:
			System.out.println("잘못된 입력입니다");
			break;
		}
		
		
		//JAVA12 부터 사용가능한 화살표 CASE문
		//기존의 SWITCH문과는 달리 CASE에 해당하는 절만 실행되고
		//그 후의 CAS는 실행되지 않는다
		switch(day) {
		case 
		"Monday","Tuesday","Wendsday","Thursday", "Friday" ->System.out.println("평일");
		case
		"Saturday", "Sunday"-> System.out.println("주말");
		default
		-> System.out.println("잘못된 입력입니다");
		}
		
		
		
		
	}
}
