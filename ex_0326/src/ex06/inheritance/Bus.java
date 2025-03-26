package ex06.inheritance;

public class Bus extends Car{
	int peopleNum;
	
	public Bus(int peopleNum) {
		this.peopleNum = peopleNum;
	}
	
	public void takePerson() {
		System.out.println("승객이 버스에 탑승하셨습니다.");
	}

}
