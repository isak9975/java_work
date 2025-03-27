package ex03_Polymorphism;

public class ComputerRoom {
	String name;
//	Samsung com1;
//	Samsung com2;
	
//	LZ com1;
//	LZ com2;
	
	Computer com1;
	Computer com2;
	
	public void allPwerOn() {
		com1.powerON();
		com2.powerON();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
	}
}
