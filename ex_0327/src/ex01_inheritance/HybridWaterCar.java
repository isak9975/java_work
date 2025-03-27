package ex01_inheritance;

public class HybridWaterCar extends HybridCar{
	int waterGauge;
	
	public HybridWaterCar(int gasGauge, int electricGauge,int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("남은 물의 량은 : " + waterGauge);
	}
}
