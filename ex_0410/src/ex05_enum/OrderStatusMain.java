package ex05_enum;

public class OrderStatusMain {
	public static void main(String[] args) {
		OrderStatus o1 = OrderStatus.ORDERED;
		
		try {
			System.out.println("함수전"+o1.name());
			o1 = o1.next();
			System.out.println("함수후"+o1.name());
			o1 = o1.next();
			System.out.println("함수후"+o1.name());
			o1 = o1.next();
			System.out.println("함수후"+o1.name());
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}
