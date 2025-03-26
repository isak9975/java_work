package ex04_overload;

public class Breadmain {
	public static void main(String[] args) {
		Bread bread = new Bread();
		
		bread.makeBread();
		bread.makeBread(3);
		bread.makeBread("크림빵",5);
	}
}
