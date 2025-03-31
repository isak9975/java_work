package ex05_generic;

public class GenEx<T> {
	//클래스명에도 제네릭이 가능하다.
	//타입이 들어가는 곳이면 어떤 곳이든 가능한것이 제네릭이다.
	T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
