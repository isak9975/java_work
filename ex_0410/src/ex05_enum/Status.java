package ex05_enum;

public enum Status {
	
	FAILS("실패"),  SUCCESS("성공");
	
	String status;
	
	private Status(String status) {
	this.status = status;
	}
	
}
