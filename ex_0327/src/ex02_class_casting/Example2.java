package ex02_class_casting;

class Car{};
class Bus extends Car{};
class SchoolBus extends Bus{};

class OpenCar extends Car{};
class SprotCar extends OpenCar{};

public class Example2 {
	public static void main(String[] args) {
		//1차 상속 관계가 아니더라도 자동 타입변환이 된다.
		Car c1 = new SchoolBus();
		
		Car c2 = new OpenCar();
		
		Bus b1 = new Bus();
		
		Bus b2 = new SchoolBus();
		
		OpenCar o1 = new SprotCar();
		
		//버스와 오픈카, 스포츠카는 상속관계가 아니기 때문에
		//타입변환을 할 수 없다.
		//Bus b3 = new OpenCar();
		//Bus b4 = new SprotCar();
	}
}
