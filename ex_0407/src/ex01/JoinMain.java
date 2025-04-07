package ex01;

public class JoinMain {
	public static void main(String[] args) {
		JoinExample joinExample = new JoinExample();
		joinExample.start();
		
		try {
			joinExample.join(); //main스레드는 worker 스레드가 끝날때까지 기다린다.
			//join이 없었다면 main 스레드랑 같이 실행되어 메인이 먼저 끝날을 것이다.
		} catch (Exception e) {

		}
		
		System.out.println("main 스레드 종료");
	}
}
