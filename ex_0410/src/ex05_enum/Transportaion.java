package ex05_enum;

//추상메서드를 가진다고 해서 추상클래스가 되는것은 아니다.
//enum자체는 추상메서드를 정의할수가 있고, 상수들이
//그 메서드를 구현을 해야한다.
public enum Transportaion {
	BUS(150) {
		//익명메서드
		@Override
		int totalFare(int distance) {
			return distance*fare;
		}
	},
	CAR(200) {
		@Override
		int totalFare(int distance) {
			return distance*fare;
		}
	},
	SHIP(250) {
		@Override
		int totalFare(int distance) {
			return distance*fare;
		}
	},
	AIRPLAN(2000) {
		@Override
		int totalFare(int distance) {
			return distance*fare;
		}
	};
	
	int fare;
	
	private Transportaion(int fare) {
		this.fare = fare;
	}
	
	//추상메서드를 정의하면
	//직접 구현을 해야한다며 오류가 난다.
	abstract int totalFare(int distance);
	
	public String toString(int distance) {
		return "name : "+name() +", 100km - fare : "+ totalFare(distance) + "원";
	}
	
	
}
