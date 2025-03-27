package ex02_class_casting;

public class CalendarMain {
	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.haging();
		dc.onTheDesk();
		
		Calendar calendar = new DeskCalendar("검은색",12);
		calendar.info();
		calendar.haging();
		//DeskCalendar 객체임에도 Calendar 타입을 가졌기 때문에
		//DeskCalendar의 멤버에는 접근 할 수 없다.
		//calendar.onTheDesk();
	}
}
