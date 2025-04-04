package ex02_thred;

public class ThreadMain {
	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest();
		t1.start();
		
		RunableTest t2 = new RunableTest();
		Thread t = new Thread(t2);
		t.start();
		
		for(int i =0;i<10;i++) {
			System.out.println("메인함수 진행중 " + i ); 
		}
		
		
		
		//Thread상속
		//단일 상속만 가능
		//간단한 구현
		//Thread클래스를 직접 다룰 수 있다.
		
		//Runnable 구현
		//다른 클래스 상속과 병행 가능
		//더 유영한 구조 가능
		//Runnbale은 실행코드만 담고 Thread는 별도로 생성
		
		//start()메서드 스레드를 시작(내부적으로 run() 호출)
	}
}
