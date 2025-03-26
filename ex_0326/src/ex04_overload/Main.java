package ex04_overload;

public class Main {
	public static void main(String[] args) {
		RectangleCalculator c = new RectangleCalculator();
		
		c.area(3);
		c.area(3,5);
		c.area(3.3,7.9);
		
System.out.println("================================================");
		Converter con = new Converter();
		System.out.println("cm -> m / "+con.convert(50)+"m");
		System.out.println("inch -> cm / "+con.convert(10, "m")+"cm");

		
	}
}
