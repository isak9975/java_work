package ex01;

public class YieldMain {
	public static void main(String[] args) {
		Runnable task = () ->{
			String name = Thread.currentThread().getName();
			for(int i =1; i<= 5; i++) {
				System.out.println(name + " : "+i);
				Thread.yield(); //양보요청
			}
		};
		
		YieldExample ye =  new YieldExample();
		ye.start();
		
		//Runnable로 만든 스레드는 독자적으로 실행할수 없으니
		//Thread에 넣어서 실행시켜 준다.
		Thread t1 = new Thread(task);
		t1.start();
		
	}
}
