package ex03_Polymorphism;
class Animal{}
class Pig extends Animal{}
class Cow extends Animal{}

class Farm{
	public void sound(Animal animal) {
		if(animal instanceof Pig) {
			System.out.println("꿀꿀");
		}
		else {
			System.out.println("음메");
		}
	}
}


public class FarmTest {
	public static void main(String[] args) {
		Farm farm = new Farm();
		Pig pig = new Pig();
		Cow cow = new Cow();
		
		farm.sound(pig);
		farm.sound(cow);
	}
}
