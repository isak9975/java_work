package ex05_enum;

public class OperationMain {
	public static void main(String[] args) {
		Operation[] op = Operation.values();
		
		for(Operation opp : op) {
			System.out.printf("Operation = %s // value = %d",opp.name(),opp.apply(10, 5));
			System.out.println();
		}
		
	}
}
