package ex01_inheritance;

public class HybridCar extends Car{
	int electricGauge;
	
	public HybridCar(int gasGauge, int electricGauge) {
		super.gasGauge = gasGauge;
		this.electricGauge = electricGauge;		
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("남은 전기량은 :" + electricGauge);
	}
}
