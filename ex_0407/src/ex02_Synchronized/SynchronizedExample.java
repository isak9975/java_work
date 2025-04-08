package ex02_Synchronized;

class Counter{
	private int count = 0;
	
	//이 메서드에 두개의 스레드가 동시에 접근할 때 에러가 발생할 수 있다.
//	public void increment() {
//		count++; //동기화 안함
//		System.out.println(Thread.currentThread().getName() + "  - count " + count);
//	}
	//synchronized를 이용해 동기화 메서드로 만들어 준다.
	//그러면 동시에 접근할 수 없기에 에러가 발생하지 않는다.
	public synchronized void increment() {
		count++; //동기화 안함
		System.out.println(Thread.currentThread().getName() + "  - count " + count);
	}

	public int getcount() {
		return count;
	}
	
}//end  Counter

public class SynchronizedExample {
	public static void main(String[] args) throws InterruptedException{
		Counter counter = new Counter();
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				counter.increment();
			}
		},"Thread-1");
		
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				counter.increment();
			}
		},"Thread-2");
		
		
		t1.start();
		t2.start();
		
		//t1과 t2가 끝날 때까지 main은 기다린다
		t1.join();
		t2.join();
		
		//가장 최종에 main문의 print문이 실행되야하기 때문에 다른 스레드들에게 join 을 걸어놓았다.
		System.out.println("최종 count: " + counter.getcount());
		
	}
}
