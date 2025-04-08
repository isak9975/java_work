package ex02_Synchronized;

public class SyncMain {
	public static void main(String[] args) {
		//Runnable 인터페이스로 구현한 스레드는 start()메서드가 없기 때문에
		//Thread 객체를 만들어서 생성자에게 전달을 하고 start() 메서드로 실행
		SynchronizedEx atm = new SynchronizedEx();
		
		Thread mom = new Thread(atm,"엄마");
		Thread son = new Thread(atm,"아들");
		
		mom.start();
		son.start();
		
		//mom과 son을 동시에 시작시켰지만 
		//Synchronized를 걸어 놔서 먼저 싫애된 객체에 락이 걸려 mom객체만 실행이 된다. -> break도 있어서
	}
}
