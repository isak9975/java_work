package ex04_api;

public class Book {
	String bookName;
	String author;
	
	public Book(String bookname, String author) {
		this.bookName = bookname;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "책 제목 : "+bookName+ ", 저자 : "+author;
	}

}
