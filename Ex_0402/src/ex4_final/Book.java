package ex4_final;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public final void info_title() {
		System.out.println("책의 제목은 "+title+" 입니다");
	}
	public void info_author() {
		System.out.println("책의 저자는 "+author+" 입니다");
	}
}

 
class Comic extends Book{
	
	boolean isColor;
	
	public Comic(String title, String author,boolean isColor) {
		super(title, author);
		this.isColor = isColor;
	}
	
	@Override
	public void info_author() {
		System.out.println("이 만화책의 저자는 " + author+" 입니다");
	}
	
	//부모클래스에서 final로 선언된 메서드를 오버라이딩 시도하면 에러가 발생한다
	//public void info_title(){
	//
	//}
	
	public void info_Color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러 입니다");
		}else {
			System.out.println("이 만화책은 흑백 입니다");
		}
	}
}