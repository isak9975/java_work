package ex03_Polymorphism;

public class Commain {
	public static void main(String[] args) {
		 ComputerRoom cr = new ComputerRoom();
		 
		 cr.com1 = new Samsung();
		 cr.com2 = new LZ();
		 
		 cr.allPwerOn();
		 cr.allPowerOff();
	}
}
