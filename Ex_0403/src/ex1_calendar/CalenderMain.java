package ex1_calendar;

public class CalenderMain {
	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.hanging();
		dc.info();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("검은색",12);
		c.info();
		c.hanging();
		((DeskCalendar) c).onTheDesk(); //-> c.onTheDesk() => 오류 -> 자식 클래스에서 만든 public 메서드는 부모클래스에서 사용 X
		
	}
}
