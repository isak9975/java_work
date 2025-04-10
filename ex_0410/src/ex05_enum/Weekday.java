package ex05_enum;
//요일 열거형 만들기
//Weekday라는 열거형을 정의하고, 요일 이름을 상수로 넣는다.
//main 메서드에서 오늘 요일이 SUNDAY면 "쉬는날입니다" 출력
//그 외에는 "출근하는 날입니다"를 출력.

public enum Weekday {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WENDSDAY,
	THUSDAY,
	FRIDAY,
	SATURDAY;
	
	public void main(Weekday day) {
		switch (day) {
			case SUNDAY: {
				System.out.println("쉬는날입니다");
				break;
			}
			case THUSDAY: case MONDAY: case FRIDAY: case WENDSDAY: case SATURDAY: case TUESDAY:{
				System.out.println("출근하는 날입니다.");break;
			}
		}
	}
}
